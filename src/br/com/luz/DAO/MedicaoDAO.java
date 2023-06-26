package br.com.luz.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

import br.com.luz.model.Medicao;

public class MedicaoDAO extends ConexaoDB {
	private static final String INSERT_MEDICAO_SQL = "INSERT INTO medicao (mes, ano, data_medicao, consumo, medidor_id, time_rota_id) VALUES (?, ?, ?, ?, ?, ?);";
    private static final String SELECT_MEDICAO_BY_ID = "SELECT * FROM medicao WHERE id = ?;";
    private static final String SELECT_ALL_MEDICAO = "SELECT * FROM medicao;";
    private static final String DELETE_MEDICAO_SQL = "DELETE FROM medicao WHERE id = ?;";
    private static final String UPDATE_MEDICAO_SQL = "UPDATE medicao SET mes = ?, ano = ?, data_medicao = ?, consumo = ?, medidor_id = ?, time_rota_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM medicao;";


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

    public void insertMedicao(Medicao entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_MEDICAO_SQL)) {
            preparedStatement.setString(1, entidade.getMes());
            preparedStatement.setString(2, entidade.getAno());
            preparedStatement.setTimestamp(3, entidade.getDataMedicao());
            preparedStatement.setString(4, entidade.getConsumo());
            preparedStatement.setInt(5, entidade.getMedidorId());
            preparedStatement.setInt(6, entidade.getTimeRotaId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Medicao selectMedicao(int id) {
        Medicao entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_MEDICAO_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String mes = rs.getString("mes");
                String ano = rs.getString("ano");
                Timestamp dataMedicao = rs.getTimestamp("data_medicao");
                String consumo = rs.getString("consumo");
                int medidorId = rs.getInt("medidor_id");
                int timeRotaId = rs.getInt("time_rota_id");
                entidade = new Medicao(id, mes, ano, dataMedicao, consumo, medidorId, timeRotaId);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Medicao> selectAllMedicao() {
        List<Medicao> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_MEDICAO)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String mes = rs.getString("mes");
                String ano = rs.getString("ano");
                Timestamp dataMedicao = rs.getTimestamp("data_medicao");
                String consumo = rs.getString("consumo");
                int medidorId = rs.getInt("medidor_id");
                int timeRotaId = rs.getInt("time_rota_id");
                entidades.add(new Medicao(id, mes, ano, dataMedicao, consumo, medidorId, timeRotaId));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteMedicao(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_MEDICAO_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateMedicao(Medicao entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_MEDICAO_SQL)) {
        	statement.setString(1, entidade.getMes());
            statement.setString(2, entidade.getAno());
            statement.setTimestamp(3, entidade.getDataMedicao());
            statement.setString(4, entidade.getConsumo());
            statement.setInt(5, entidade.getMedidorId());
            statement.setInt(6, entidade.getTimeRotaId());
            statement.setInt(7, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
