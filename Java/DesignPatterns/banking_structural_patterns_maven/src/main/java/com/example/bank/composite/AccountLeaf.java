package com.example.bank.composite;

import com.example.bank.model.Account;

public class AccountLeaf implements AccountComponent {
    private final Account account;
    public AccountLeaf(Account account){ this.account = account; }
    @Override public double getBalance(){ return account.getBalance(); }
    @Override public void print(String indent){ System.out.println(indent + account); }
}
