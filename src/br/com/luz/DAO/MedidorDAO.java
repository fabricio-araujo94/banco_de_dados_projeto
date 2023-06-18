package br.com.luz.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.luz.model.Medidor;

public class MedidorDAO extends ConexaoDB {
	private static final String INSERT_MEDIDOR_SQL = "INSERT INTO medidor (descricao, rota_id, poste_id) VALUES (?, ?, ?);";
    private static final String SELECT_MEDIDOR_BY_ID = "SELECT * FROM medidor WHERE id = ?;";
    private static final String SELECT_ALL_MEDIDOR = "SELECT * FROM medidor;";
    private static final String DELETE_MEDIDOR_SQL = "DELETE FROM medidor WHERE id = ?;";
    private static final String UPDATE_MEDIDOR_SQL = "UPDATE medidor SET descricao = ?, rota_id = ?, poste_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM medidor;";


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

    public void insertMedidor(Medidor entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_MEDIDOR_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());
            preparedStatement.setInt(2, entidade.getRota_id());
            preparedStatement.setInt(3, entidade.getPoste_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Medidor selectMedidor(int id) {
        Medidor entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_MEDIDOR_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                int rota_id = rs.getInt("rota_id");
                int poste_id = rs.getInt("poste_id");
                entidade = new Medidor(id, descricao, rota_id, poste_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Medidor> selectAllMedidor() {
        List<Medidor> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_MEDIDOR)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                int rota_id = rs.getInt("rota_id");
                int poste_id = rs.getInt("poste_id");
                entidades.add(new Medidor(id, descricao, rota_id, poste_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteMedidor(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_MEDIDOR_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateMedidor(Medidor entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_MEDIDOR_SQL)) {
        	statement.setString(1, entidade.getDescricao());
            statement.setInt(2, entidade.getRota_id());
            statement.setInt(3, entidade.getPoste_id());
            statement.setInt(4, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
