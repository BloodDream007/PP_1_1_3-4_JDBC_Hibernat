package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    public void createUsersTable() {
        new UserDaoJDBCImpl().createUsersTable();
    }

    public void dropUsersTable() {
        new UserDaoJDBCImpl().dropUsersTable();
    }


    public void saveUser(String name, String lastName, byte age) {
        new UserDaoJDBCImpl().saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        new UserDaoJDBCImpl().removeUserById(id);
    }

    public List<User> getAllUsers() {
//        return new UserServiceImpl().getAllUsers();
        //        List<User> allUsers = new ArrayList<>();
//        try {
//            String SQL = "SELECT * FROM users";
//
////          ResultSet resultSet = Util.getConnection().prepareStatement(SQL).executeQuery();
//            ResultSet resultSet = Util.getConnection().createStatement().executeQuery(SQL);
//            while (resultSet.next()) {
//                User user = new User();
//
//                user.setId(resultSet.getLong("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("lastname"));
//                user.setAge((byte) resultSet.getInt("age"));
//
//                allUsers.add(user);
//
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        List<User> allUsers =
        return new UserServiceImpl().getAllUsers();
    }

    public void cleanUsersTable() {
        new UserDaoJDBCImpl().cleanUsersTable();
    }
}
//    public void saveUser(String name, String lastName, byte age) {
//        try {
//            String SQL = "insert into new_db.users(name, lastname, age) value (" + "'" + name + "'" + "," +
//                    "'" + lastName + "'," + age + " )";
//            Util.getConnection().createStatement().executeUpdate(SQL);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
