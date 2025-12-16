
package com.example.bank.entity;
import jakarta.persistence.*;

@Entity
public class Account {
 @Id @GeneratedValue
 private Long id;
 private String holderName;
 private double balance;
 public Long getId(){return id;}
 public double getBalance(){return balance;}
 public void setBalance(double b){this.balance=b;}
}
