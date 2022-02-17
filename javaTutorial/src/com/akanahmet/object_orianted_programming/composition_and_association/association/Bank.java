package com.akanahmet.object_orianted_programming.composition_and_association.association;

public class Bank {

        private String bankName;
        private String bankAdress;

    public Bank() {
    }

    public Bank(String bankName, String bankAdress) {
        this.bankName = bankName;
        this.bankAdress = bankAdress;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankAdress='" + bankAdress + '\'' +
                '}';
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAdress() {
        return bankAdress;
    }

    public void setBankAdress(String bankAdress) {
        this.bankAdress = bankAdress;
    }
}
