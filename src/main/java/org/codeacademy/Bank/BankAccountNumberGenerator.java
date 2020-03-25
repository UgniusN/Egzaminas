package org.codeacademy.Bank;

import java.util.Random;

public class BankAccountNumberGenerator {
    public String generateNumber() {
        Random rand = new Random();
        String saskaitosNr = "LT";
        for(int i=0; i<16; i++) {
            saskaitosNr+=rand.nextInt(9);
        }
        return saskaitosNr;
    }
}
