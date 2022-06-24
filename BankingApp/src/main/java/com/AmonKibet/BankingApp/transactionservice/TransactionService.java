package com.AmonKibet.BankingApp.transactionservice;

/*TransactionService.java
Using TransactionRepository to return the list based off the account number
*/

import com.AmonKibet.BankingApp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.AmonKibet.BankingApp.transaction.Transaction;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    public TransactionService(final TransactionRepository repository){
        this.repository = repository;
    }

    public List<Transaction> findAllByAccountNumber(final Integer accountNumber){
        return repository.findAllByAccountNumber(accountNumber);
    }
    private final TransactionRepository repository;
}
