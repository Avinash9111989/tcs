package com.example.bank.proxy;

import com.example.bank.model.Account;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RealAccountAccessor implements AccountAccessor {
    private final Map<String, Account> store = new ConcurrentHashMap<>();
    public void add(Account a){ store.put(a.getId(), a); }
    @Override public Account getAccount(String id){ return store.get(id); }
}
