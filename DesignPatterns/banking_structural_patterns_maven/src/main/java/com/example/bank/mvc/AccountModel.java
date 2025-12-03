package com.example.bank.mvc;

import com.example.bank.model.Account;

public class AccountModel {
    private Account account;
    public AccountModel(Account account){ this.account = account; }
    public Account getAccount(){ return account; }
    public void deposit(double amt){ account.deposit(amt); }
    public boolean withdraw(double amt){ return account.withdraw(amt); }
}
