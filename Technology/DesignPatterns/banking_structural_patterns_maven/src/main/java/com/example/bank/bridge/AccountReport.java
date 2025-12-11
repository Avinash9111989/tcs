package com.example.bank.bridge;

public abstract class AccountReport {
    protected ReportRenderer renderer;
    protected AccountReport(ReportRenderer renderer){ this.renderer = renderer; }
    public abstract void generate(String accountId);
}
