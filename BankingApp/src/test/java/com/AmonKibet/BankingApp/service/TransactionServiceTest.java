package com.AmonKibet.BankingApp.service;
/*---service.TransactionServiceTest.java
 ----Unit testing TransactionService using junit
*/
import com.AmonKibet.BankingApp.BankingAppApplication;
import org.junit.jupiter.api.Test;
import com.AmonKibet.BankingApp.transactionservice.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


//This will allow Spring to automatically resolve
//the beans and inject them where they are needed.
@SpringBootTest(classes = {BankingAppApplication.class})
public class TransactionServiceTest {
    @Autowired
    private TransactionService transactionService;

    @Test
    public void testTransactionCount() {
        assertEquals(2, transactionService.findAllByAccountNumber(28282828).size());
    }
}
