package com.example.bank.observer;

import com.example.bank.model.Account;

public class EmailNotifier implements BalanceObserver {
    @Override public void updated(Account account){ System.out.println("[EMAIL] Account " + account.getId() + " balance=" + account.getBalance()); }
}
