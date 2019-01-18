package com.example.springcurs7e2.repositories;

import com.example.springcurs7e2.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
