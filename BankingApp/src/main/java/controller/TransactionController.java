package controller;
/* TransactionController.java
---
  */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import transaction.Transaction;
import transactionService.TransactionService;

import java.util.List;
@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {

    //constructor
    public TransactionController(final TransactionService transactionService){
        this.transactionService = transactionService;
    }
    @GetMapping("/{accountNumber}")
    public List<Transaction> findAllByAccountNumber(@PathVariable("accountNumber") final Integer accountNumber){
        return transactionService.findAllByAccountNumber(accountNumber);
    }
    private final TransactionService transactionService;
}
