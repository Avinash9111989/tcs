package com.example.bank.composite;

import com.example.bank.model.Account;

public interface AccountComponent {
    double getBalance();
    void print(String indent);
}
