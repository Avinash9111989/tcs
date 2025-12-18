package com.example.bank.service;
import com.example.bank.entity.Account;
import com.example.bank.repo.AccountRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
 private static final Logger log = LogManager.getLogger(AccountService.class);
 private final AccountRepository repo;

 public AccountService(AccountRepository repo) {
  this.repo = repo;
 }

 public Account create(Account acc) {
  log.info("Creating account for {}", acc.getHolder());
  return repo.save(acc);
 }

 public Account get(Long id) {
  log.debug("Fetching account {}", id);
  return repo.findById(id).orElseThrow();
 }
}