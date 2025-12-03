package com.example.bank.strategy;

import com.example.bank.model.Account;

public class TieredInterestStrategy implements InterestStrategy {
    @Override public double calculate(Account account){
        double b = account.getBalance();
        if(b < 1000) return b * 0.01;
        if(b < 10000) return b * 0.02;
        return b * 0.03;
    }
}
