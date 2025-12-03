package com.example.bank.command;

import com.example.bank.model.Account;

public class TransferCommand implements Command {
    private final Account from;
    private final Account to;
    private final double amount;
    private boolean executed = false;
    public TransferCommand(Account from, Account to, double amount){ this.from = from; this.to = to; this.amount = amount; }
    @Override
    public void execute(){
        if(from.withdraw(amount)){
            to.deposit(amount);
            executed = true;
            System.out.println("Executed transfer " + amount + " from " + from.getId() + " to " + to.getId());
        } else {
            System.out.println("Transfer failed: insufficient funds"); 
        }
    }
    @Override public void undo(){ if(executed){ to.withdraw(amount); from.deposit(amount); System.out.println("Undo transfer"); } }
}
