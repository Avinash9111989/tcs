package com.example.bank.model;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount() {}
    public CurrentAccount(String id, String owner, double balance, double overdraftLimit) {
        super(id, owner, balance); this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void printType() { System.out.println("CurrentAccount - overdraft=" + overdraftLimit); }
}
