
package com.example.transaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
 @GetMapping("/transaction")
 public String transaction() {
  return "Transaction Service Working";
 }
}
