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
            PreparedStatement statement = connection.prepareStatement(
                        "INSERT INTO " +
                            "USERLIST(USERNAME,PASSWORD) " +
                            "VALUES(?,?);");
            statement.setString(1,user);
            statement.setString(2,password);
            statement.executeUpdate();
            connection.commit();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean checkIfBankAccountExists(String accountNumber) {
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                        "SELECT ACCOUNT_NUMBER " +
                            "FROM BANK_ACCOUNT " +
                            "WHERE ACCOUNT_NUMBER = ?;");
            statement.setString(1,accountNumber);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) return false;
            else return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void createBankAccount(String accountNumber,Integer userid) {
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO BANK_ACCOUNT(" +
                        "USER_ID,ACCOUNT_NUMBER,BALANCE,DEBT )" +
                        "VALUES(?,?,0.0,0.0)"
            );
            statement.setInt(1,userid);
            statement.setString(2,accountNumber);
            statement.executeUpdate();
            connection.commit();
            statement.close();
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

    public int getUserIdByUsername(String username) {
        Integer id = 0;
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                        "SELECT ID " +
                            "FROM USERLIST " +
                            "WHERE USERNAME = ?;"
            );
            statement.setString(1,username);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            id = rs.getInt("ID");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

}
