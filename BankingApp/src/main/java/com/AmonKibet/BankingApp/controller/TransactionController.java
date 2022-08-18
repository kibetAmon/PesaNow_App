package com.AmonKibet.BankingApp.controller;


import com.AmonKibet.BankingApp.controller.dto.TransactionDto;
import com.AmonKibet.BankingApp.transaction.Transaction;
import org.springframework.web.bind.annotation.*;
import com.AmonKibet.BankingApp.transactionservice.TransactionService;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {

    //constructor
    public TransactionController(final TransactionService transactionService){
        this.transactionService = transactionService;
    }
    @CrossOrigin //Fixing CORS error
    @GetMapping("/{accountNumber}")
    public List<TransactionDto> findAllByAccountNumber(@PathVariable("accountNumber") final Integer accountNumber){
        return transactionService.findAllByAccountNumber(accountNumber)

                .stream().map(this::map) //returns a stream consisting of the results of applying the
                // map function to the elements of this stream

                .collect(toList()); //It returns a Collector Interface that
        // gathers the input data onto a new list.
    }

    private TransactionDto map(final Transaction tr){
        return TransactionDto.apply(tr);
    }
    private final TransactionService transactionService;

}
