package com.example.bank.abstractfactory;

public interface AbstractBankFactory {
    AccountProduct createAccountProduct(String owner);
    LoanProduct createLoanProduct(double amount);
}
