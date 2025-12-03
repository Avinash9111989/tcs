package com.example.bank.builder;

import java.time.Instant;

public class Transaction {
    private String id;
    private String fromAccount;
    private String toAccount;
    private double amount;
    private Instant timestamp;
    private String description;

    private Transaction() {}

    public static class Builder {
        private final Transaction t = new Transaction();

        public Builder id(String id) { t.id = id; return this; }
        public Builder from(String a) { t.fromAccount = a; return this; }
        public Builder to(String a) { t.toAccount = a; return this; }
        public Builder amount(double amt) { t.amount = amt; return this; }
        public Builder timestamp(Instant ts) { t.timestamp = ts; return this; }
        public Builder description(String d) { t.description = d; return this; }
        public Transaction build() { if (t.timestamp == null) t.timestamp = Instant.now(); return t; }
    }

    @Override
    public String toString() {
        return "Transaction[id=" + id + ", from=" + fromAccount + ", to=" + toAccount + ", amount=" + amount + ", time=" + timestamp + "]";
    }
}
