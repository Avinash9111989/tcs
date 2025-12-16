package com.example.bank.template;

public class DetailedReport extends ReportTemplate {
    @Override protected void header(String accountId){ System.out.println("Detailed Report Header: " + accountId); }
    @Override protected void body(String accountId){ System.out.println("Detailed body content for " + accountId); }
}
