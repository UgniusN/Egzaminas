package org.codeacademy.Bank;

import java.util.Scanner;

public class BankSystem {
    BankInterface bankInterface = new BankInterface();
    Scanner scanner = new Scanner(System.in);
    DbManager dbManager = new DbManager();
    public void start() {
        bankInterface.printStartMenu();
        switch(scanner.nextInt()) {
            case 1:
                login();
                operations();
                break;
            case 2:
                register();
                break;
        }


    }


    public void register() {
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        for( ; ; ) {
            System.out.println("Enter password: ");
            String password = scanner.nextLine();
            System.out.println("Repeat password");
            String repeatedPassword = scanner.nextLine();
            if(password == repeatedPassword) {
                dbManager.createUser(username,password);
                break;
            }
            else {
                System.out.println("Passwords do not match. Please try again.");
            }
        }
    }
    private void login() {
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
    }

    private void operations() {
        bankInterface.printOperationsMenu();
        switch (scanner.nextInt()) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }
}
