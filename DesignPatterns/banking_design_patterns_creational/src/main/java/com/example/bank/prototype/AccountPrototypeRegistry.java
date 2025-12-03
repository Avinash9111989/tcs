package com.example.bank.prototype;

import com.example.bank.model.*;
import java.util.HashMap;
import java.util.Map;

public class AccountPrototypeRegistry {
    private final Map<String, Account> registry = new HashMap<>();

    public void register(String key, Account prototype) { registry.put(key, prototype); }
    public Account create(String key) { Account p = registry.get(key); return p == null ? null : p.clone(); }
}
