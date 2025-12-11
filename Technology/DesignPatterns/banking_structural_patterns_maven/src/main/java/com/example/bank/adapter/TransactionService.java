package com.example.bank.adapter;

// Target interface expected by modern code
public interface TransactionService {
    boolean transfer(String fromAccountId, String toAccountId, double amount);
}
