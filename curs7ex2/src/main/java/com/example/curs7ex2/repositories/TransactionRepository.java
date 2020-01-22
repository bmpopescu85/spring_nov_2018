package com.example.curs7ex2.repositories;

import com.example.curs7ex2.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
