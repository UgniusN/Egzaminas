package org.codeacademy.Bank;

import java.util.Scanner;

public class BankSystem {
    BankInterface bankInterface = new BankInterface();
    Scanner scanner = new Scanner(System.in);
    DbManager dbManager = new DbManager();
    private BankAccountNumberGenerator bankAccountNumberGenerator = new BankAccountNumberGenerator();
    public void start() {
        bankInterface.printStartMenu();
        boolean cycleStatus = true;
        while(cycleStatus)
            switch(scanner.nextInt()) {
                case 1:
                    login();
                    System.out.println("Successfuly logged in!");
                    operations();
                    break;
                case 2:
                    register();
                    System.out.println("Registration complete!");
            }
    }


    public void register() {
        System.out.println("Enter username: ");
        scanner.nextLine();
        String username = scanner.nextLine();
        for( ; ; ) {
            System.out.println("Enter password: ");
            String password = scanner.nextLine();
            System.out.println("Repeat password");
            String repeatedPassword = scanner.nextLine();
            if(password.equals( repeatedPassword)) {
                createEndUser(username,password);
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

    private void createEndUser(String username, String password) {
        boolean cycleStatus = true;
        String accountNumber;
        dbManager.createUser(username,password);
        Integer id = dbManager.getUserIdByUsername(username);
        while(cycleStatus) {
            accountNumber = bankAccountNumberGenerator.generateNumber();
            if(dbManager.checkIfBankAccountExists(accountNumber)) {
                dbManager.createBankAccount(accountNumber,id);
                cycleStatus = false;
            }
        }
    }

}
