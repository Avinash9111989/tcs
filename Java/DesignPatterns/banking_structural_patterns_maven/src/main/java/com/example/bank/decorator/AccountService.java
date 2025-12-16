package com.example.bank.decorator;

import com.example.bank.model.Account;

public interface AccountService {
    void deposit(Account a, double amt);
    boolean withdraw(Account a, double amt);
}
