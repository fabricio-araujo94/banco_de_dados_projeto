package br.com.luz.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.luz.model.Tarifa;

public class TarifaDAO extends ConexaoDB {
	private static final String INSERT_TARIFA_SQL = "INSERT INTO tarifa (taxa, classe_id, lei, data_inicio, data_fim, aliquota_ICMS) VALUES (?, ?, ?, ?, ?, ?);";
    private static final String SELECT_TARIFA_BY_ID = "SELECT * FROM tarifa WHERE id = ?;";
    private static final String SELECT_ALL_TARIFA = "SELECT * FROM tarifa;";
    private static final String DELETE_TARIFA_SQL = "DELETE FROM tarifa WHERE id = ?;";
    private static final String UPDATE_TARIFA_SQL = "UPDATE tarifa SET taxa = ?, classe_id = ?, lei = ?, data_inicio = ?, data_fim = ?, aliquota_ICMS = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM tarifa;";


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

    public void insertTarifa(Tarifa entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_TARIFA_SQL)) {
        	preparedStatement.setString(1, entidade.getTaxa());
            preparedStatement.setInt(2, entidade.getClasse_id());
            preparedStatement.setString(3, entidade.getLei());
            preparedStatement.setString(4, entidade.getData_inicio());
            preparedStatement.setString(5, entidade.getData_fim());
            preparedStatement.setString(6, entidade.getAliquota_ICMS());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Tarifa selectTarifa(int id) {
        Tarifa entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_TARIFA_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String taxa = rs.getString("taxa");
                int classe_id = rs.getInt("classe_id");
                String lei = rs.getString("lei");
                String data_inicio = rs.getString("data_inicio");
                String data_fim = rs.getString("data_fim");
                String aliquota_ICMS = rs.getString("aliquota_ICMS");
                entidade = new Tarifa(id, taxa, classe_id, lei, data_inicio, data_fim, aliquota_ICMS);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Tarifa> selectAllTarifa() {
        List<Tarifa> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_TARIFA)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String taxa = rs.getString("taxa");
                int classe_id = rs.getInt("classe_id");
                String lei = rs.getString("lei");
                String data_inicio = rs.getString("data_inicio");
                String data_fim = rs.getString("data_fim");
                String aliquota_ICMS = rs.getString("aliquota_ICMS");
                entidades.add(new Tarifa(id, taxa, classe_id, lei, data_inicio, data_fim, aliquota_ICMS));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteTarifa(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_TARIFA_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateTarifa(Tarifa entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_TARIFA_SQL)) {
        	statement.setString(1, entidade.getTaxa());
            statement.setInt(2, entidade.getClasse_id());
            statement.setString(3, entidade.getLei());
            statement.setString(4, entidade.getData_inicio());
            statement.setString(5, entidade.getData_fim());
            statement.setString(6, entidade.getAliquota_ICMS());
            statement.setInt(7, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
