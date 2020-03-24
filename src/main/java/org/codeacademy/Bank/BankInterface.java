package org.codeacademy.Bank;

public class BankInterface {

    public void printStartMenu() {
        System.out.println("Welcome to bank system V1");
        System.out.println("Enter 1 to log in");
        System.out.println("Enter 2 to register");
    }

    public void printOperationsMenu() {
        System.out.println("Select an operation");
        System.out.println("Enter 1 to check your bank accounts and balances");
        System.out.println("Enter 2 to check your transaction history");
        System.out.println("Enter 3 to put money into your bank account");
        System.out.println("Enter 4 to take money from your bank account");
        System.out.println("Enter 5 to make a transaction to a person");
        System.out.println("Press 6 to get a transaction list from between two dates");
    }
}
