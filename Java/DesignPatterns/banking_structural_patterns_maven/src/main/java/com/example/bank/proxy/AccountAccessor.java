package com.example.bank.proxy;

import com.example.bank.model.Account;

public interface AccountAccessor {
    Account getAccount(String id);
}
