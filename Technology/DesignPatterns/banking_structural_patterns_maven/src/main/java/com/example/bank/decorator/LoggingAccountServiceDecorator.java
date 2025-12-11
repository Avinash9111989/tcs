package com.example.bank.decorator;

import com.example.bank.model.Account;

public class LoggingAccountServiceDecorator implements AccountService {
    private final AccountService delegate;
    public LoggingAccountServiceDecorator(AccountService delegate){ this.delegate = delegate; }
    @Override public void deposit(Account a, double amt){
        System.out.println("[LOG] Depositing " + amt + " to " + a.getId());
        delegate.deposit(a, amt);
    }
    @Override public boolean withdraw(Account a, double amt){
        System.out.println("[LOG] Withdrawing " + amt + " from " + a.getId());
        return delegate.withdraw(a, amt);
    }
}
