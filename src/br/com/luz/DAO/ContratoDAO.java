package br.com.luz.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

import br.com.luz.model.Contrato;

public class ContratoDAO extends ConexaoDB {
	private static final String INSERT_CONTRATO_SQL = "INSERT INTO contrato (descricao, medidor_id, data_criacao, medidor_id, classe_id, cliente_id) VALUES (?, ?, ?, ?, ?, ?);";
    private static final String SELECT_CONTRATO_BY_ID = "SELECT * FROM contrato WHERE id = ?;";
    private static final String SELECT_ALL_CONTRATO = "SELECT * FROM contrato;";
    private static final String DELETE_CONTRATO_SQL = "DELETE FROM contrato WHERE id = ?;";
    private static final String UPDATE_CONTRATO_SQL = "UPDATE contrato SET descricao = ?, medidor_id = ?, data_criacao = ?, medidor_id = ?, classe_id = ?, cliente_id = ? WHERE id = ?;";
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
            preparedStatement.setTimestamp(2, entidade.getData_inicio());
            preparedStatement.setTimestamp(3, entidade.getData_criacao());
            preparedStatement.setInt(4, entidade.getMedidor_id());
            preparedStatement.setInt(5, entidade.getClasse_id());
            preparedStatement.setInt(6, entidade.getCliente_id());
            preparedStatement.setInt(7, entidade.getId());
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
                Timestamp data_inicio = rs.getTimestamp("data_inicio");
                Timestamp data_criacao = rs.getTimestamp("data_criacao");
                int medidor_id = rs.getInt("medidor_id");
                int classe_id = rs.getInt("classe_id");
                int cliente_id = rs.getInt("cliente_id");
                entidade = new Contrato(id, descricao, data_inicio, data_criacao, medidor_id, classe_id, cliente_id);
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
                Timestamp data_inicio = rs.getTimestamp("data_inicio");
                Timestamp data_criacao = rs.getTimestamp("data_criacao");
                int medidor_id = rs.getInt("medidor_id");
                int classe_id = rs.getInt("classe_id");
                int cliente_id = rs.getInt("cliente_id");
                entidades.add(new Contrato(id, descricao, data_inicio, data_criacao, medidor_id, classe_id, cliente_id));
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
            statement.setTimestamp(2, entidade.getData_inicio());
            statement.setTimestamp(3, entidade.getData_criacao());
            statement.setInt(4, entidade.getMedidor_id());
            statement.setInt(5, entidade.getClasse_id());
            statement.setInt(6, entidade.getCliente_id());
            statement.setInt(7, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
