package com.example.bank.model;

public class Account {
    private final String id;
    private String owner;
    private double balance;

    public Account(String id, String owner, double balance){
        this.id = id; this.owner = owner; this.balance = balance;
    }
    public String getId(){ return id; }
    public String getOwner(){ return owner; }
    public void setOwner(String owner){ this.owner = owner; }
    public double getBalance(){ return balance; }
    public void deposit(double amt){ balance += amt; }
    public boolean withdraw(double amt){ if(amt<=balance){ balance -= amt; return true; } return false; }
    @Override public String toString(){ return "Account[id="+id+", owner="+owner+", bal="+balance+"]"; }
}
