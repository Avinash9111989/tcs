package com.example.bank.entity;
import jakarta.persistence.*;

@Entity
public class Account {
 @Id
 @GeneratedValue
 private Long id;
 private String holder;
 private double balance;

 public Long getId() { return id; }
 public String getHolder() { return holder; }
 public double getBalance() { return balance; }
 public void setHolder(String holder) { this.holder = holder; }
 public void setBalance(double balance) { this.balance = balance; }
}