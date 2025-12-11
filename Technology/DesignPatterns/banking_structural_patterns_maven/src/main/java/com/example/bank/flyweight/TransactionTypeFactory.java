package com.example.bank.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TransactionTypeFactory {
    private static final Map<String, TransactionType> cache = new ConcurrentHashMap<>();
    public static TransactionType getType(String key){
        return cache.computeIfAbsent(key, k -> new TransactionType(k));
    }
}
