package com.example.bank.proxy;

import com.example.bank.model.Account;

public class AccountProxy implements AccountAccessor {
    private final AccountAccessor real;
    private final String userRole;
    public AccountProxy(AccountAccessor real, String userRole){ this.real = real; this.userRole = userRole; }
    @Override public Account getAccount(String id){
        if("auditor".equals(userRole) || "admin".equals(userRole)){
            return real.getAccount(id);
        }
        System.out.println("Access denied for role=" + userRole);
        return null;
    }
}
