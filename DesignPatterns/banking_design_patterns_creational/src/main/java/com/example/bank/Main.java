package com.example.bank;

import com.example.bank.factory.AccountFactory;
import com.example.bank.factory.AccountFactory.Type;
import com.example.bank.model.*;
import com.example.bank.abstractfactory.*;
import com.example.bank.builder.Transaction;
import com.example.bank.prototype.AccountPrototypeRegistry;
import com.example.bank.singleton.BankRegistry;
import com.example.bank.objectpool.*;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Factory Pattern ===");
        Account a1 = AccountFactory.createAccount(Type.SAVINGS, "A1", "Alice", 1000);
        Account a2 = AccountFactory.createAccount(Type.CURRENT, "A2", "Bob", 500);
        a1.printType(); a2.printType();

        System.out.println("\n=== Abstract Factory ===");
        AbstractBankFactory retail = new RetailBankFactory();
        AbstractBankFactory corp = new CorporateBankFactory();
        retail.createAccountProduct("Charlie").showDetails();
        corp.createLoanProduct(1_000_000).showLoanInfo();

        System.out.println("\n=== Builder Pattern ===");
        Transaction t = new Transaction.Builder()
                .id("T1").from("A1").to("A2").amount(150).timestamp(Instant.now()).description("Rent")
                .build();
        System.out.println(t);

        System.out.println("\n=== Prototype Pattern ===");
        AccountPrototypeRegistry reg = new AccountPrototypeRegistry();
        SavingsAccount template = new SavingsAccount("TEMPL1", "TemplateOwner", 0, 0.04);
        reg.register("savings.template", template);
        Account cloned = reg.create("savings.template");
        cloned.deposit(200);
        cloned.printType();
        System.out.println("Cloned balance=" + cloned.getBalance());

        System.out.println("\n=== Singleton Pattern ===");
        BankRegistry.getInstance().registerBank("B1", "MyBank");
        System.out.println("Registered: " + BankRegistry.getInstance().getBank("B1"));

        System.out.println("\n=== Object Pool Pattern ===");
        ObjectPool<MockConnection> pool = new ObjectPool<>(2, MockConnection::new);
        MockConnection c1 = pool.acquire();
        MockConnection c2 = pool.acquire();
        c1.execute("SELECT * FROM accounts");
        pool.release(c1);
        MockConnection c3 = pool.acquire(); // will reuse c1
        c3.execute("UPDATE accounts SET balance=balance+100");

        System.out.println("\n=== Demo complete ===");
    }
}
