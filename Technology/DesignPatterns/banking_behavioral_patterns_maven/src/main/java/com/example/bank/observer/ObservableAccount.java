package com.example.bank.observer;

import com.example.bank.model.Account;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ObservableAccount {
    private final Account account;
    private final List<BalanceObserver> observers = new CopyOnWriteArrayList<>();
    public ObservableAccount(Account account){ this.account = account; }
    public void addObserver(BalanceObserver o){ observers.add(o); }
    public void removeObserver(BalanceObserver o){ observers.remove(o); }
    public void deposit(double amt){ account.deposit(amt); notifyAllObservers(); }
    public boolean withdraw(double amt){ boolean ok = account.withdraw(amt); notifyAllObservers(); return ok; }
    public Account getAccount(){ return account; }
    private void notifyAllObservers(){ observers.forEach(o -> o.updated(account)); }
}
