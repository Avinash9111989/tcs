package com.example.bank.module;

public class ReportingModule implements Module {
    @Override public String getName(){ return "reporting"; }
    @Override public void start(){ System.out.println("ReportingModule started"); }
    @Override public void stop(){ System.out.println("ReportingModule stopped"); }
}
