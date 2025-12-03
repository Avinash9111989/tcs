package com.example.bank.mediator;

import com.example.bank.model.Account;

public class AccountComponent {
    private final String id;
    private final Account account;
    private final BranchMediator mediator;
    public AccountComponent(String id, Account account, BranchMediator mediator){
        this.id = id; this.account = account; this.mediator = mediator;
        mediator.registerAccount(id, this);
    }
    public String getId(){ return id; }
    public Account getAccount(){ return account; }
    public void requestTransfer(String toId, double amt){ mediator.transfer(id, toId, amt); }
}
