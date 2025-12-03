package com.example.bank.adapter;

public class LegacyTransactionAdapter implements TransactionService {
    private final LegacyTransactionService legacy;
    public LegacyTransactionAdapter(LegacyTransactionService legacy){ this.legacy = legacy; }
    @Override
    public boolean transfer(String fromAccountId, String toAccountId, double amount) {
        String res = legacy.transferFunds(fromAccountId, toAccountId, amount);
        return res != null && res.startsWith("OK");
    }
}
