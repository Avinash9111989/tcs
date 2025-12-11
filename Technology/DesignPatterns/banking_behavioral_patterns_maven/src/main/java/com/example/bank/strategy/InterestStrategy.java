package com.example.bank.strategy;

import com.example.bank.model.Account;

public interface InterestStrategy {
    double calculate(Account account);
}
