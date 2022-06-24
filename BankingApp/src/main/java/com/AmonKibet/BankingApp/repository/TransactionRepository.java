package com.AmonKibet.BankingApp.repository;

import com.AmonKibet.BankingApp.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*Extending with Jpa Repository; Jpa repository contains API for basic CRUD operations and also API for pagination and sorting.

Repository annotation; class provides the mechanism for storage,
retrieval, search, update and delete operation on objects.
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findAllByAccountNumber(final Integer accountNumber);

}
