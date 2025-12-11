package com.example.bank.mediator;

import com.example.bank.model.Account;

public interface BranchMediator {
    void registerAccount(String id, AccountComponent component);
    void transfer(String fromId, String toId, double amt);
}
