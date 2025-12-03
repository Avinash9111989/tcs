package com.example.bank.mvc;

public class AccountController {
    private final AccountModel model;
    private final AccountView view;
    public AccountController(AccountModel model, AccountView view){ this.model = model; this.view = view; }
    public void deposit(double amt){ model.deposit(amt); view.show("Deposited: " + amt); }
    public void withdraw(double amt){ boolean ok = model.withdraw(amt); view.show(ok?"Withdrawn:"+amt:"Withdraw failed"); }
    public void showBalance(){ view.show("Balance: " + model.getAccount().getBalance()); }
}
