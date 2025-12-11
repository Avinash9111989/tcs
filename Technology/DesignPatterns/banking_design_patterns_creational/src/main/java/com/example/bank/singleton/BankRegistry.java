package com.example.bank.singleton;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class BankRegistry {
    private final Map<String, String> banks = new ConcurrentHashMap<>();

    private BankRegistry() {}
    private static class Holder { static final BankRegistry INSTANCE = new BankRegistry(); }
    public static BankRegistry getInstance() { return Holder.INSTANCE; }

    public void registerBank(String id, String name) { banks.put(id, name); }
    public String getBank(String id) { return banks.get(id); }
}
