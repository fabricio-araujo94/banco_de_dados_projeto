package br.com.luz.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.luz.model.Classe;

public class ClasseDAO extends ConexaoDB {
	private static final String INSERT_CLASSE_SQL = "INSERT INTO classe (descricao, Classe_id) VALUES (?, ?);";
    private static final String SELECT_CLASSE_BY_ID = "SELECT * FROM classe WHERE id = ?;";
    private static final String SELECT_ALL_CLASSE = "SELECT * FROM classe;";
    private static final String DELETE_CLASSE_SQL = "DELETE FROM classe WHERE id = ?;";
    private static final String UPDATE_CLASSE_SQL = "UPDATE classe SET descricao = ?, Classe_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM classe;";


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

    public void insertClasse(Classe entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_CLASSE_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());
            preparedStatement.setInt(2, entidade.getTipo_fase());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Classe selectClasse(int id) {
        Classe entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_CLASSE_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                int tipo_fase_id = rs.getInt("tipo_fase_id");
                entidade = new Classe(id, descricao, tipo_fase_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Classe> selectAllClasse() {
        List<Classe> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_CLASSE)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                int tipo_fase_id = rs.getInt("tipo_fase_id");
                entidades.add(new Classe(id, descricao, tipo_fase_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteClasse(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_CLASSE_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateClasse(Classe entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_CLASSE_SQL)) {
            statement.setString(1, entidade.getDescricao());
            statement.setInt(2, entidade.getTipo_fase());
            statement.setInt(3, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
