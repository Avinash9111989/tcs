
package com.example.bank.service;
import org.springframework.stereotype.Service;
import com.example.bank.entity.Account;
import com.example.bank.repository.AccountRepository;

@Service
public class AccountService {
 private final AccountRepository repo;
 public AccountService(AccountRepository repo){this.repo=repo;}

 public Account deposit(Account acc,double amt){
  acc.setBalance(acc.getBalance()+amt);
  return repo.save(acc);
 }
}
