package com.example.bank.visitor;

import com.example.bank.model.Account;

public interface AccountVisitor {
    void visit(Account account);
}
