package org.codeacademy.Bank;

import java.sql.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");
        BankSystem bankSystem = new BankSystem();
        bankSystem.start();
    }
}
