package com.example.bank.template;

public abstract class ReportTemplate {
    public final void generate(String accountId){
        header(accountId);
        body(accountId);
        footer(accountId);
    }
    protected abstract void header(String accountId);
    protected abstract void body(String accountId);
    protected void footer(String accountId){ System.out.println("--- End Report for " + accountId); }
}
