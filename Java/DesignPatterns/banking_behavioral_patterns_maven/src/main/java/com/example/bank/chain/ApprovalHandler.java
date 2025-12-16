package com.example.bank.chain;

import com.example.bank.model.Account;

public abstract class ApprovalHandler {
    protected ApprovalHandler next;
    public ApprovalHandler linkWith(ApprovalHandler next){ this.next = next; return next; }
    public abstract boolean approve(Account account, double amount);
    protected boolean checkNext(Account account, double amount){
        if(next == null) return false;
        return next.approve(account, amount);
    }
}
