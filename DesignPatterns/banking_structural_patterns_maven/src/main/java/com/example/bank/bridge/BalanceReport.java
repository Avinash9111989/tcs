package com.example.bank.bridge;

public class BalanceReport extends AccountReport {
    public BalanceReport(ReportRenderer renderer){ super(renderer); }
    @Override
    public void generate(String accountId){
        renderer.renderHeader("Balance Report for " + accountId);
        renderer.renderLine("Available balance: (simulated)"); // would call service in real app
        renderer.renderFooter();
    }
}
