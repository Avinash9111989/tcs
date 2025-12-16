package com.example.bank.composite;

import java.util.ArrayList;
import java.util.List;

public class AccountGroup implements AccountComponent {
    private final String name;
    private final List<AccountComponent> children = new ArrayList<>();
    public AccountGroup(String name){ this.name = name; }
    public void add(AccountComponent c){ children.add(c); }
    public void remove(AccountComponent c){ children.remove(c); }
    @Override public double getBalance(){
        return children.stream().mapToDouble(AccountComponent::getBalance).sum();
    }
    @Override public void print(String indent){
        System.out.println(indent + "Group: " + name + " (total=" + getBalance() + ")");
        children.forEach(c -> c.print(indent + "  "));
    }
}
