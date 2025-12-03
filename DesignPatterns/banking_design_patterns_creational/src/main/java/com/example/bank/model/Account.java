package com.example.bank.model;

public abstract class Account implements Cloneable {
    protected String id;
    protected String owner;
    protected double balance;

    public Account() {}
    public Account(String id, String owner, double balance) {
        this.id = id; this.owner = owner; this.balance = balance;
    }

    public abstract void printType();

    public void deposit(double amt) { balance += amt; }
    public boolean withdraw(double amt) {
        if (amt <= balance) { balance -= amt; return true; }
        return false;
    }

    public double getBalance() { return balance; }
    public String getId() { return id; }

    // Prototype support
    @Override
    public Account clone() {
        try { return (Account) super.clone(); }
        catch (CloneNotSupportedException e) { throw new RuntimeException(e); }
    }
}
