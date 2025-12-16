package com.example.bank.factory;

import com.example.bank.model.*;

public class AccountFactory {
    public enum Type { SAVINGS, CURRENT }

    public static Account createAccount(Type type, String id, String owner, double balance) {
        switch (type) {
            case SAVINGS: return new SavingsAccount(id, owner, balance, 0.03);
            case CURRENT: return new CurrentAccount(id, owner, balance, 1000.0);
            default: throw new IllegalArgumentException("Unknown type");
        }
    }
}
