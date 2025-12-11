package com.example.bank.mediator;

import com.example.bank.model.Account;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleBranchMediator implements BranchMediator {
    private final Map<String, AccountComponent> registry = new ConcurrentHashMap<>();
    @Override public void registerAccount(String id, AccountComponent component){ registry.put(id, component); }
    @Override public void transfer(String fromId, String toId, double amt){
        AccountComponent f = registry.get(fromId), t = registry.get(toId);
        if(f==null || t==null){ System.out.println("Unknown account"); return; }
        if(f.getAccount().withdraw(amt)){ t.getAccount().deposit(amt); System.out.println("Mediator transferred " + amt); }
        else System.out.println("Mediator: insufficient funds"); 
    }
}
