package br.com.luz.servico;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import br.com.luz.DAO.ConexaoDB;
import br.com.luz.model.ContaDeLuz;

public class ServicoContaDeLuz extends ConexaoDB {
	 private static final String SELECT_DADOS = "SELECT rota.descricao rota, medidor.descricao medidor, poste.codigo poste, pessoa.nome, pessoa.cpf, pessoa.cnpj, classe.descricao classe, tipo_fase.descricao fase, medicao.data_medicao, medicao.consumo, tarifa.taxa, tarifa.lei, tarifa.aliquota_ICMS FROM contrato "
			+ "INNER JOIN classe "
			+ "ON contrato.classe_id = classe.id "
			+ "INNER JOIN tipo_fase "
			+ "ON classe.tipo_fase_id = tipo_fase.id "
			+ "INNER JOIN cliente "
			+ "ON contrato.cliente_id = cliente.id "
			+ "INNER JOIN pessoa "
			+ "ON cliente.pessoa_id = pessoa.id "
			+ "INNER JOIN tipo_pessoa "
			+ "ON pessoa.tipo_pessoa_id = tipo_pessoa.id "
			+ "INNER JOIN medidor "
			+ "ON contrato.medidor_id = medidor.id "
			+ "INNER JOIN rota "
			+ "ON medidor.rota_id = rota.id "
			+ "INNER JOIN poste "
			+ "ON medidor.poste_id = poste.id "
			+ "INNER JOIN medicao "
			+ "ON medicao.medidor_id = medidor.id "
			+ "INNER JOIN cobranca "
			+ "ON cobranca.medicao_id = medicao.id "
			+ "INNER JOIN tarifa "
			+ "ON cobranca.tarifa_id = tarifa.id "
			+ "WHERE contrato.id = ?;";
	
	public ContaDeLuz gerarContaDeLuz(int id) {
        ContaDeLuz entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_DADOS)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
            	String rota = rs.getString("rota");
            	String medidor = rs.getString("medidor");
	    	 	String poste = rs.getString("poste");
	    	 	String nome = rs.getString("nome");
	    	 	String cpf = rs.getString("cpf");
	    	 	String cnpj = rs.getString("cnpj");
	    	 	String classe = rs.getString("classe");
	    	 	String tipoFase = rs.getString("fase");
	    	 	Timestamp dataMedicao = rs.getTimestamp("data_medicao");
	    	 	String consumo = rs.getString("consumo"); 
	    		String taxa = rs.getString("taxa");
	    	 	String lei = rs.getString("lei");
	    	 	String aliquotaICMS = rs.getString("aliquota_ICMS");
	    		String valor = Float.toString(Float.valueOf(consumo).floatValue() * Float.valueOf(taxa).floatValue()); 
	    		entidade = new ContaDeLuz(rota, medidor, poste, nome, cpf, cnpj, classe, tipoFase, dataMedicao, consumo, taxa, lei, aliquotaICMS, valor);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

}
