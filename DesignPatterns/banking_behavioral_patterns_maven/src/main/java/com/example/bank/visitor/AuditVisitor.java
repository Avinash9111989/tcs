package com.example.bank.visitor;

import com.example.bank.model.Account;

public class AuditVisitor implements AccountVisitor {
    @Override public void visit(Account account){
        System.out.println("Auditing account " + account.getId() + ": balance=" + account.getBalance());
    }
}
