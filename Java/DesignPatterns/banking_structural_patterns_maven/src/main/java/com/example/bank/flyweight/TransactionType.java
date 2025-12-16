package com.example.bank.flyweight;

public class TransactionType {
    private final String name;
    public TransactionType(String name){ this.name = name; }
    public String getName(){ return name; }
    @Override public String toString(){ return "TxnType("+name+")"; }
}
