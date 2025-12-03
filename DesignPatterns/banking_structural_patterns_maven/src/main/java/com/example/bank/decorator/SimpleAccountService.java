package com.example.bank.decorator;

import com.example.bank.model.Account;

public class SimpleAccountService implements AccountService {
    @Override public void deposit(Account a, double amt){ a.deposit(amt); }
    @Override public boolean withdraw(Account a, double amt){ return a.withdraw(amt); }
}
