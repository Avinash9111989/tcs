package com.example.bank.facade;

import com.example.bank.model.Account;
import com.example.bank.decorator.AccountService;
import com.example.bank.decorator.SimpleAccountService;

public class BankFacade {
    private final AccountService accountService;
    public BankFacade(){ this.accountService = new SimpleAccountService(); }
    public void transfer(Account from, Account to, double amt){
        if(accountService.withdraw(from, amt)){
            accountService.deposit(to, amt);
        } else {
            System.out.println("Transfer failed: insufficient funds"); 
        }
    }
    public void topup(Account to, double amt){ accountService.deposit(to, amt); }
}
