package br.com.luz.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.luz.model.Time_rota;

public class Time_rotaDAO extends ConexaoDB {
	private static final String INSERT_TIME_ROTA_SQL = "INSERT INTO time_rota (funcionario_id, tarefa_rota_id) VALUES (?, ?;";
    private static final String SELECT_TIME_ROTA_BY_ID = "SELECT * FROM time_rota WHERE id = ?;";
    private static final String SELECT_ALL_TIME_ROTA = "SELECT * FROM time_rota;";
    private static final String DELETE_TIME_ROTA_SQL = "DELETE FROM time_rota WHERE id = ?;";
    private static final String UPDATE_TIME_ROTA_SQL = "UPDATE time_rota SET funcionario_id = ?, tarefa_rota_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM time_rota;";


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

    public void insertTime_rota(Time_rota entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_TIME_ROTA_SQL)) {
            preparedStatement.setInt(1, entidade.getFuncionario_id());
            preparedStatement.setInt(2, entidade.getTarefa_rota_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Time_rota selectTime_rota(int id) {
        Time_rota entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_TIME_ROTA_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int funcionario_id = rs.getInt("funcionario_id");
                int tarefa_rota_id = rs.getInt("tarefa_rota_id");
        
                entidade = new Time_rota(id, funcionario_id, tarefa_rota_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Time_rota> selectAllTime_rota() {
        List<Time_rota> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_TIME_ROTA)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int funcionario_id = rs.getInt("funcionario_id");
                int tarefa_rota_id = rs.getInt("tarefa_rota_id");
                entidades.add(new Time_rota(id, funcionario_id, tarefa_rota_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteTime_rota(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_TIME_ROTA_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateTime_rota(Time_rota entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_TIME_ROTA_SQL)) {
        	statement.setInt(1, entidade.getFuncionario_id());
            statement.setInt(2, entidade.getTarefa_rota_id());
            statement.setInt(3, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
