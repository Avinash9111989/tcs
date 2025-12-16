package com.example.bank.visitor;

import com.example.bank.model.Account;

public interface VisitableAccount {
    void accept(AccountVisitor visitor);
}
