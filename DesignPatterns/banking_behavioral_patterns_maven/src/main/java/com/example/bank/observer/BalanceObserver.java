package com.example.bank.observer;

import com.example.bank.model.Account;

public interface BalanceObserver {
    void updated(Account account);
}
