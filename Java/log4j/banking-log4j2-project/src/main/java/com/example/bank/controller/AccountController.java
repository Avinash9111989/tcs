package com.example.bank.controller;
import com.example.bank.entity.Account;
import com.example.bank.service.AccountService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

 private static final Logger log = LogManager.getLogger(AccountController.class);
 private final AccountService service;

 public AccountController(AccountService service) {
  this.service = service;
 }

 @PostMapping
 public Account create(@RequestBody Account acc) {
  log.info("POST /accounts called");
  return service.create(acc);
 }

 @GetMapping("/{id}")
 public Account get(@PathVariable Long id) {
  log.info("GET /accounts/{}", id);
  return service.get(id);
 }
}