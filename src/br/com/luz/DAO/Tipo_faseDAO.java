package br.com.luz.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.luz.model.TipoFase;

public class Tipo_faseDAO extends ConexaoDB {
	private static final String INSERT_TIPO_FASE_SQL = "INSERT INTO tipo_fase (descricao) VALUES (?);";
    private static final String SELECT_TIPO_FASE_BY_ID = "SELECT id, descricao FROM tipo_fase WHERE id = ?;";
    private static final String SELECT_ALL_TIPO_FASE = "SELECT * FROM tipo_fase;";
    private static final String DELETE_TIPO_FASE_SQL = "DELETE FROM tipo_fase WHERE id = ?;";
    private static final String UPDATE_TIPO_FASE_SQL = "UPDATE tipo_fase SET descricao = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM tipo_fase;";

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

    public void insertTipo_fase(TipoFase entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_TIPO_FASE_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public TipoFase selectTipo_fase(int id) {
        TipoFase entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_TIPO_FASE_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                entidade = new TipoFase(id, descricao);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<TipoFase> selectAllTipo_fase() {
        List<TipoFase> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_TIPO_FASE)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                entidades.add(new TipoFase(id, descricao));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteTipo_fase(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_TIPO_FASE_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateTipo_fase(TipoFase entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_TIPO_FASE_SQL)) {
            statement.setString(1, entidade.getDescricao());
            statement.setInt(2, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
