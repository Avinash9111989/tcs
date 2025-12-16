
package com.example.bank.controller;
import org.springframework.web.bind.annotation.*;
import com.example.bank.entity.Account;
import com.example.bank.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
 private final AccountService service;
 public AccountController(AccountService s){this.service=s;}

 @PostMapping("/deposit")
 public Account deposit(@RequestBody Account a){
  return service.deposit(a,1000);
 }
}
