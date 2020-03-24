package org.codeacademy.Bank;

import java.sql.*;
import java.util.Date;
import java.util.List;

public class DbManager {
    private Connection createConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:h2:tcp://localhost/~/test",
                "sa",
                ""
        );
        return connection;
    }
    public void createUser(String user, String password) {
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO USERLIST(USERNAME,PASSWORD) VALUES(?,?)");
            statement.setString(1,user);
            statement.setString(2,password);
            statement.executeUpdate();
            connection.commit();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createBankAccount() {
        try {
            Connection connection = createConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getUserBalance(String username) {
        try {
            Connection connection = createConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
