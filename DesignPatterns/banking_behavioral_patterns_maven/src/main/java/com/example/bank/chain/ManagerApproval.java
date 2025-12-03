package com.example.bank.chain;

import com.example.bank.model.Account;

public class ManagerApproval extends ApprovalHandler {
    private final double limit;
    public ManagerApproval(double limit){ this.limit = limit; }
    @Override
    public boolean approve(Account account, double amount){
        if(amount <= limit){
            System.out.println("Manager approved " + amount);
            return true;
        }
        System.out.println("Manager cannot approve " + amount);
        return checkNext(account, amount);
    }
}
