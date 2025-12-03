package com.example.bank.strategy;

import com.example.bank.model.Account;

public class SimpleInterestStrategy implements InterestStrategy {
    private final double rate;
    public SimpleInterestStrategy(double rate){ this.rate = rate; }
    @Override public double calculate(Account account){ return account.getBalance() * rate; }
}
