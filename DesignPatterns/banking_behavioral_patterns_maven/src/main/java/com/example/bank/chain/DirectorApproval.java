package com.example.bank.chain;

import com.example.bank.model.Account;

public class DirectorApproval extends ApprovalHandler {
    private final double limit;
    public DirectorApproval(double limit){ this.limit = limit; }
    @Override
    public boolean approve(Account account, double amount){
        if(amount <= limit){
            System.out.println("Director approved " + amount);
            return true;
        }
        System.out.println("Director cannot approve " + amount);
        return checkNext(account, amount);
    }
}
