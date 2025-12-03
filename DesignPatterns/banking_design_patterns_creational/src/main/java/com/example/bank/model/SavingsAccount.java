package com.example.bank.model;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount() {}
    public SavingsAccount(String id, String owner, double balance, double interestRate) {
        super(id, owner, balance); this.interestRate = interestRate;
    }

    @Override
    public void printType() { System.out.println("SavingsAccount - interest=" + interestRate); }
}
