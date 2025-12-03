package com.example.bank.adapter;

// Legacy service with an old API
public class LegacyTransactionService {
    public String transferFunds(String srcId, String dstId, double amount){
        // returns status code string in legacy format
        return "OK:transferred:" + amount + ";from:" + srcId + ";to:" + dstId;
    }
}
