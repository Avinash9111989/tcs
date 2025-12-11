package com.example.bank.abstractfactory;

public class CorporateBankFactory implements AbstractBankFactory {
    @Override
    public AccountProduct createAccountProduct(String owner) {
        return new AccountProduct() {
            @Override
            public void showDetails() { System.out.println("Corporate Account for " + owner); }
        };
    }

    @Override
    public LoanProduct createLoanProduct(double amount) {
        return new LoanProduct() {
            @Override
            public void showLoanInfo() { System.out.println("Corporate Loan of " + amount); }
        };
    }
}
