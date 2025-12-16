package com.example.bank;

import com.example.bank.model.Account;
import com.example.bank.chain.*;
import com.example.bank.command.*;
import com.example.bank.iterator.*;
import com.example.bank.mediator.*;
import com.example.bank.observer.*;
import com.example.bank.strategy.*;
import com.example.bank.template.*;
import com.example.bank.visitor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Chain of Responsibility Demo ---");
        ApprovalHandler mgr = new ManagerApproval(1000);
        ApprovalHandler dir = new DirectorApproval(10000);
        mgr.linkWith(dir);
        Account acc = new Account("c1","Cust",5000);
        mgr.approve(acc, 500); // manager approves
        mgr.approve(acc, 2000); // manager -> director approves

        System.out.println("\n--- Command Demo ---");
        Account a1 = new Account("t1","A",1000);
        Account a2 = new Account("t2","B",200);
        TransactionProcessor tp = new TransactionProcessor();
        tp.execute(new TransferCommand(a1, a2, 300));
        tp.undoLast();
        System.out.println(a1 + " " + a2);

        System.out.println("\n--- Iterator Demo ---");
        AccountCollection col = new AccountCollection();
        col.add(new Account("i1","X",100));
        col.add(new Account("i2","Y",200));
        for(Account a : col) System.out.println("Iter: " + a);

        System.out.println("\n--- Mediator Demo ---");
        SimpleBranchMediator mediator = new SimpleBranchMediator();
        AccountComponent ca = new AccountComponent("m1", new Account("m1","M",500), mediator);
        AccountComponent cb = new AccountComponent("m2", new Account("m2","N",100), mediator);
        ca.requestTransfer("m2", 200);
        System.out.println(ca.getAccount() + " " + cb.getAccount());

        System.out.println("\n--- Observer Demo ---");
        ObservableAccount oacc = new ObservableAccount(new Account("o1","Obs",50));
        oacc.addObserver(new EmailNotifier());
        oacc.deposit(25); oacc.withdraw(10);

        System.out.println("\n--- Strategy Demo ---");
        Account strat = new Account("s1","Strat",5000);
        InterestStrategy is = new TieredInterestStrategy();
        System.out.println("Interest: " + is.calculate(strat));

        System.out.println("\n--- Template Method Demo ---");
        ReportTemplate rpt = new DetailedReport();
        rpt.generate("rep1");

        System.out.println("\n--- Visitor Demo ---");
        AccountElement elem = new AccountElement(new Account("v1","V",800));
        AuditVisitor av = new AuditVisitor();
        elem.accept(av);
    }
}
