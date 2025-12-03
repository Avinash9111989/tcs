package com.example.bank;

import com.example.bank.adapter.*;
import com.example.bank.bridge.*;
import com.example.bank.composite.*;
import com.example.bank.decorator.*;
import com.example.bank.facade.*;
import com.example.bank.flyweight.*;
import com.example.bank.mvc.*;
import com.example.bank.frontcontroller.*;
import com.example.bank.module.*;
import com.example.bank.proxy.*;
import com.example.bank.model.Account;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Adapter Demo ---");
        LegacyTransactionService legacy = new LegacyTransactionService();
        TransactionService tx = new LegacyTransactionAdapter(legacy);
       // TransactionService tx1=new LegacyTransactionAdapter
        System.out.println("Transfer status: " + tx.transfer("A1","A2",100));

        System.out.println("\n--- Bridge Demo ---");
        ReportRenderer html = new HTMLRenderer();
        AccountReport rpt = new BalanceReport(html);
        rpt.generate("A1");

        System.out.println("\n--- Composite Demo ---");
        AccountLeaf a1 = new AccountLeaf(new Account("a1","Alice",500));
        AccountLeaf a2 = new AccountLeaf(new Account("a2","Bob",700));
        AccountGroup branch = new AccountGroup("Branch-1"); 
        branch.add(a1); branch.add(a2);
        branch.print(""); 
        System.out.println("Branch total=" + branch.getBalance());

        System.out.println("\n--- Decorator Demo ---");
        Account acc = new Account("x1","X",1000);
        AccountService svc = new LoggingAccountServiceDecorator(new SimpleAccountService());
        svc.deposit(acc, 200);
        svc.withdraw(acc, 50);

        System.out.println("\n--- Facade Demo ---");
        BankFacade facade = new BankFacade();
        Account aFrom = new Account("f1","From",300);
        Account aTo = new Account("t1","To",100);
        facade.transfer(aFrom, aTo, 150);
        System.out.println(aFrom + " -> " + aTo);

        System.out.println("\n--- Flyweight Demo ---");
        TransactionType t1 = TransactionTypeFactory.getType("PAYMENT");
        TransactionType t2 = TransactionTypeFactory.getType("PAYMENT");
        System.out.println(t1 + " == " + t2);

        System.out.println("\n--- MVC Demo ---");
        Account mvcAcc = new Account("m1","MVCUser",400);
        AccountModel model = new AccountModel(mvcAcc);
        AccountView view = new AccountView();
        AccountController controller = new AccountController(model, view);
        controller.deposit(100); controller.showBalance();

        System.out.println("\n--- Front Controller Demo ---");
        FrontController fc = new FrontController();
        fc.register("ping", p -> System.out.println("pong"));
        fc.register("echo", p -> { if(p.length>1) System.out.println(String.join(" ", java.util.Arrays.copyOfRange(p,1,p.length))); });
        fc.dispatch("ping"); fc.dispatch("echo Hello from FC");

        System.out.println("\n--- Module Demo ---");
        ModuleRegistry mr = new ModuleRegistry();
        mr.register(new ReportingModule());
        mr.startAll(); mr.stopAll();

        System.out.println("\n--- Proxy Demo ---");
        RealAccountAccessor real = new RealAccountAccessor();
        Account adminAcct = new Account("pr1","ProxyUser",250);
        real.add(adminAcct);
        AccountAccessor proxy = new AccountProxy(real, "auditor");
        System.out.println("Proxy fetch: " + proxy.getAccount("pr1"));
        AccountAccessor proxy2 = new AccountProxy(real, "guest"); System.out.println(proxy2.getAccount("pr1"));
    }
}
