package com.example.bank.visitor;

import com.example.bank.model.Account;

public class AccountElement implements VisitableAccount {
    private final Account account;
    public AccountElement(Account account){ this.account = account; }
    @Override public void accept(AccountVisitor visitor){ visitor.visit(account); }
    public Account getAccount(){ return account; }
}
