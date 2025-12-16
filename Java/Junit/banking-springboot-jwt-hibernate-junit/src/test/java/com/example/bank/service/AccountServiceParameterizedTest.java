
package com.example.bank.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.bank.entity.Account;
import com.example.bank.repository.AccountRepository;

@ExtendWith(MockitoExtension.class)
class AccountServiceParameterizedTest {

    @Mock
    AccountRepository repo;

    @InjectMocks
    AccountService service;

    @ParameterizedTest
    @ValueSource(doubles = {100, 500, 1000})
    void depositWithMultipleAmounts(double amount) {
        Account acc = new Account();
        acc.setBalance(1000);
        when(repo.save(any(Account.class))).thenReturn(acc);

        Account result = service.deposit(acc, amount);
        assertEquals(1000 + amount, result.getBalance());
    }
}
