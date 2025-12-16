
package com.example.bank.service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import com.example.bank.entity.Account;
import com.example.bank.repository.AccountRepository;

@ExtendWith(MockitoExtension.class)
class AccountServiceTest {

 @Mock
 AccountRepository repo;

 @InjectMocks
 AccountService service;

 @Test
 void testDeposit(){
  Account acc=new Account();
  acc.setBalance(1000);
  when(repo.save(any(Account.class))).thenReturn(acc);
  Account result=service.deposit(acc,500);
  assertEquals(1500,result.getBalance());
 }
}
