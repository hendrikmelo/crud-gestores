package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.User;
import util.DbUtil;

public class UserDao {

    private Connection connection;

    public UserDao() {
        connection = DbUtil.getConnection();
    }

    public void addUser(User user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into gestor(nme_gestor, mat_gestor, data_nascimento,setor_gestor) values (?, ?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNme_gestor());
            preparedStatement.setString(2, user.getSetor_gestor());
            preparedStatement.setInt(3, user.getMat_gestor());
            System.out.println(user.getData_nascimento());
            preparedStatement.setDate(4, new java.sql.Date(user.getData_nascimento().getTime()));    
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int userId) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from gestor where id_gestor=?");
            // Parameters start with 1
            preparedStatement.setInt(1, userId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update gestor set nme_gestor=?, mat_gestor=?, data_nascimento=?, setor_gestor=?" +
                            "where id_gestor=?");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNme_gestor());
            preparedStatement.setInt(2, user.getMat_gestor());
            preparedStatement.setDate(3, new java.sql.Date(user.getData_nascimento().getTime()));
            preparedStatement.setString(5, user.getSetor_gestor());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        List<User> listaDeUsuario = new ArrayList<User>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from gestor");
            while (rs.next()) {
                User user = new User();
                user.setId_gestor(rs.getInt("id_gestor"));
                user.setNme_gestor(rs.getString("nme_gestor"));
                user.setMat_gestor(rs.getInt("mat_gestor"));
                user.setData_nascimento(rs.getDate("data_nascimento"));
                user.setSetor_gestor(rs.getString("setor_gestor"));
                listaDeUsuario.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDeUsuario;
    }

    public User getUserById(int userId) {
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from gestor where id_gestor=?");
            preparedStatement.setInt(1, userId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setId_gestor(rs.getInt("id_gestor"));
                user.setNme_gestor(rs.getString("nme_gestor"));
                user.setMat_gestor(rs.getInt("mat_gestor"));
                user.setData_nascimento(rs.getDate("data_nascimento"));
                user.setSetor_gestor(rs.getString("setor_gestor"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}