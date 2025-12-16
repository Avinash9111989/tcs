
package com.example.bank.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.bank.entity.Account;
import com.example.bank.repository.AccountRepository;

@ExtendWith(MockitoExtension.class)
class AccountServiceNegativeTest {

    @Mock
    AccountRepository repo;

    @InjectMocks
    AccountService service;

    @Test
    void depositWithZeroAmount_shouldNotChangeBalance() {
        Account acc = new Account();
        acc.setBalance(1000);
        when(repo.save(any(Account.class))).thenReturn(acc);

        Account result = service.deposit(acc, 0);
        assertEquals(1000, result.getBalance());
    }

    @Test
    void depositWithNegativeAmount_shouldThrowException() {
        Account acc = new Account();
        acc.setBalance(1000);

        assertThrows(RuntimeException.class, () -> {
            service.deposit(acc, -500);
        });
    }
}
