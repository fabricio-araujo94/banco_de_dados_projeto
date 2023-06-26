package br.com.luz.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

import br.com.luz.model.Contrato;

public class ContratoDAO extends ConexaoDB {
	private static final String INSERT_CONTRATO_SQL = "INSERT INTO contrato (descricao, data_inicio, data_criacao, medidor_id, classe_id, cliente_id) VALUES (?, ?, ?, ?, ?, ?);";
    private static final String SELECT_CONTRATO_BY_ID = "SELECT * FROM contrato WHERE id = ?;";
    private static final String SELECT_ALL_CONTRATO = "SELECT * FROM contrato;";
    private static final String DELETE_CONTRATO_SQL = "DELETE FROM contrato WHERE id = ?;";
    private static final String UPDATE_CONTRATO_SQL = "UPDATE contrato SET descricao = ?, data_inicio = ?, data_criacao = ?, medidor_id = ?, classe_id = ?, cliente_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM contrato;";


    public Integer count() {
        Integer count = 0;
        try (PreparedStatement preparedStatement = prepararSQL(TOTAL)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                count = rs.getInt("count");
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    public void insertContrato(Contrato entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_CONTRATO_SQL)) {
        	preparedStatement.setString(1, entidade.getDescricao());
            preparedStatement.setTimestamp(2, entidade.getDataInicio());
            preparedStatement.setTimestamp(3, entidade.getDataCriacao());
            preparedStatement.setInt(4, entidade.getMedidorId());
            preparedStatement.setInt(5, entidade.getClasseId());
            preparedStatement.setInt(6, entidade.getClienteId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Contrato selectContrato(int id) {
        Contrato entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_CONTRATO_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                Timestamp dataInicio = rs.getTimestamp("data_inicio");
                Timestamp dataCriacao = rs.getTimestamp("data_criacao");
                int medidorId = rs.getInt("medidor_id");
                int classeId = rs.getInt("classe_id");
                int clienteId = rs.getInt("cliente_id");
                entidade = new Contrato(id, descricao, dataInicio, dataCriacao, medidorId, classeId, clienteId);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Contrato> selectAllContrato() {
        List<Contrato> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_CONTRATO)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                Timestamp dataInicio = rs.getTimestamp("data_inicio");
                Timestamp dataCriacao = rs.getTimestamp("data_criacao");
                int medidorId = rs.getInt("medidor_id");
                int classeId = rs.getInt("classe_id");
                int clienteId = rs.getInt("cliente_id");
                entidades.add(new Contrato(id, descricao, dataInicio, dataCriacao, medidorId, classeId, clienteId));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteContrato(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_CONTRATO_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateContrato(Contrato entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_CONTRATO_SQL)) {
        	statement.setString(1, entidade.getDescricao());
            statement.setTimestamp(2, entidade.getDataInicio());
            statement.setTimestamp(3, entidade.getDataCriacao());
            statement.setInt(4, entidade.getMedidorId());
            statement.setInt(5, entidade.getClasseId());
            statement.setInt(6, entidade.getClienteId());
            statement.setInt(7, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
