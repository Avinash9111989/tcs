package com.example.bank.iterator;

import com.example.bank.model.Account;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class AccountCollection implements Iterable<Account> {
    private final List<Account> accounts = new ArrayList<>();
    public void add(Account a){ accounts.add(a); }
    public void remove(Account a){ accounts.remove(a); }
    @Override public Iterator<Account> iterator(){ return accounts.iterator(); }
}
