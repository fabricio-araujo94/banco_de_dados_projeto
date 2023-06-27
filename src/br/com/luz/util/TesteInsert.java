package br.com.luz.util;

import java.sql.Timestamp;
import java.sql.SQLException;

import br.com.luz.DAO.*;
import br.com.luz.model.*;

public class TesteInsert {
    public static void main(String[] args) throws SQLException, Exception {   	
    	RotaDAO rota = new RotaDAO();
    	PosteDAO poste = new PosteDAO();
    	TipoPessoaDAO tipoPessoa = new TipoPessoaDAO();
    	TipoFaseDAO tipoFase = new TipoFaseDAO();
    	ClasseDAO classe = new ClasseDAO();
    	PessoaDAO pessoa = new PessoaDAO();
    	ClienteDAO cliente = new ClienteDAO();
    	FuncionarioDAO funcionario = new FuncionarioDAO();
    	MedidorDAO medidor = new MedidorDAO();
    	TarefaRotaDAO tarefaRota = new TarefaRotaDAO();
    	TimeRotaDAO timeRota = new TimeRotaDAO();
    	MedicaoDAO medicao = new MedicaoDAO();
    	ContratoDAO contrato = new ContratoDAO();
    	TarifaDAO tarifa = new TarifaDAO();
    	CobrancaDAO cobranca = new CobrancaDAO();
    	
    	
    	rota.insertRota(new Rota(1, "Rota Litoral"));
    	rota.insertRota(new Rota(2, "Rota Centro"));
    	rota.insertRota(new Rota(3, "Rota Bairro A"));	

    	poste.insertPoste(new Poste(1, "-49.0629788", "-26.9244749", "poste-1", ""));
    	poste.insertPoste(new Poste(2, "-49.0629790", "-26.9244749", "poste-2", ""));
    	poste.insertPoste(new Poste(3, "-49.0629800", "-26.9244749", "poste-3",""));

    	tipoPessoa.insertTipoPessoa(new TipoPessoa(1, "JURIDICA"));
    	tipoPessoa.insertTipoPessoa(new TipoPessoa(2, "FISICA"));
    	
    	tipoFase.insertTipoFase(new TipoFase(1, "MONOFASICO"));
    	tipoFase.insertTipoFase(new TipoFase(2, "BIFASICO"));
    	tipoFase.insertTipoFase(new TipoFase(3, "TRIFASICO"));
    	
    	classe.insertClasse(new Classe(1, "RESIDENCIAL", 1));
    	classe.insertClasse(new Classe(2, "COMERCIAL", 2));
    	classe.insertClasse(new Classe(3, "INDUSTRIAL", 3));
    	
    	pessoa.insertPessoa(new Pessoa(1, "USUARIO 1", "123456789", null, 2));
    	pessoa.insertPessoa(new Pessoa(2, "USUARIO JURIDICO 1", null, "2345678901", 1));
    	pessoa.insertPessoa(new Pessoa(3, "USUARIO 2", "128888789", null, 2));
    	
    	cliente.insertCliente(new Cliente(1, "12345", "54321", 1));
    	cliente.insertCliente(new Cliente(2, "34633", "54111", 2));
    	
    	funcionario.insertFuncionario(new Funcionario(1, "23456", 1));
    	
    	medidor.insertMedidor(new Medidor(1, "abc-1", 1, 1));
    	medidor.insertMedidor(new Medidor(2, "abc-2", 2, 2));
    	
    	tarefaRota.insertTarefaRota(new TarefaRota(1, "sem observacoes", Timestamp.valueOf("2018-05-10 00:00:00"), Timestamp.valueOf("2018-05-13 00:00:00"), 1));
    	tarefaRota.insertTarefaRota(new TarefaRota(1, "sem observacoes", Timestamp.valueOf("2020-03-10 00:00:00"), Timestamp.valueOf("2020-03-13 00:00:00"), 2));
    	
    	timeRota.insertTimeRota(new TimeRota(1, 1, 1));
    	timeRota.insertTimeRota(new TimeRota(2, 1, 2));
    	
    	medicao.insertMedicao(new Medicao(1, "05", "2018", Timestamp.valueOf("2018-05-11 00:00:00"), "138.2", 1, 1));
    	medicao.insertMedicao(new Medicao(2, "08", "2022", Timestamp.valueOf("2022-08-11 00:00:00"), "234.2", 1, 1));
    	medicao.insertMedicao(new Medicao(3, "03", "2020", Timestamp.valueOf("2020-03-11 00:00:00"), "92.7", 2, 2));
    	medicao.insertMedicao(new Medicao(4, "03", "2020", Timestamp.valueOf("2020-03-11 00:00:00"), "100.28", 1, 1));

    	contrato.insertContrato(new Contrato(1, "ter11", Timestamp.valueOf("2015-01-01 00:00:00"), Timestamp.valueOf("2015-01-01 00:00:00"), 1, 1, 1));
    	contrato.insertContrato(new Contrato(2, "vopppp", Timestamp.valueOf("2020-01-01 00:00:00"), Timestamp.valueOf("2020-01-01 00:00:00"), 2, 1, 2));
    	
    	tarifa.insertTarifa(new Tarifa(1, "0.75292", 1, "1", "2018-01-01", "2018-06-01", "0.27"));
    	
    	cobranca.insertCobranca(new Cobranca(1, "05", "2018", 1, 1));
    	cobranca.insertCobranca(new Cobranca(2, "08", "2022", 1, 2));
    	cobranca.insertCobranca(new Cobranca(3, "03", "2020", 1, 3));
    	cobranca.insertCobranca(new Cobranca(4, "03", "2020", 1, 4));
    	
    	System.out.println("OK !");
    	
    	/*
        //count
        System.out.println(marcaDAO.count());
        
        //salvar
         marca = new ("Citroen");
        marcaDAO.insert(marca);

        //buscar por ID
        marca = marcaDAO.select(2);
        System.out.println(marca);

        //Update
        marca.setDescricao("Volt");
        marcaDAO.update(marca);
        marca = marcaDAO.select(2);
        System.out.println(marca);

        //Select all
        List<> marcas = marcaDAO.selectAlls();
        marcas.forEach(System.out::println);

        //Delete
        marcaDAO.delete(2);
        marcaDAO.selectAlls().forEach(System.out::println);

        System.out.println(new Gson().toJson(marca));
        */
    }
}
