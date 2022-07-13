package com.AmonKibet.BankingApp.service;
/*---service.TransactionServiceTest.java
 ----Unit testing TransactionService using junit
*/
import com.AmonKibet.BankingApp.repository.TransactionRepository;
import com.AmonKibet.BankingApp.transaction.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.AmonKibet.BankingApp.transactionservice.TransactionService;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyInt;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
class TransactionServiceTest {
    @Mock
    TransactionRepository transactionRepository;

    @BeforeEach
            public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testTransactionCount() {
        when(transactionRepository.findAllByAccountNumber(anyInt()))
                .thenReturn(transactions());

        var transactionService = new TransactionService(transactionRepository);
        assertEquals(1, transactionService.findAllByAccountNumber(28282828).size());
    }


    private List<Transaction> transactions(){
        return List.of(
                Transaction
                        .builder()
                        .type("credit")
                        .date(new Date())
                        .accountNumber(28282828)
                        .currency("KSH")
                        .amount(500.00)
                        .merchantName("amon")
                        .merchantLogo("Images/equity.png")
                        .build()
        );
    }
}
