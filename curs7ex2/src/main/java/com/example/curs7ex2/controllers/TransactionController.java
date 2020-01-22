package com.example.curs7ex2.controllers;

import com.example.curs7ex2.model.Transaction;
import com.example.curs7ex2.proxy.LogsProxy;
import com.example.curs7ex2.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Transactional
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private LogsProxy logsProxy;

    @PostMapping("/add/transaction")
    public void storeTransaction(@RequestBody Transaction transaction) {
        logsProxy.sendLogs("Adding transaction " + LocalDateTime.now());
        transactionRepository.save(transaction);

        // De fapt cand se executa logul asta tranzactia nu s-a efectuat inca.
        // Ea se efectueaza la commit, adica atunci cand se termina metoda
        // 'storeTransaction' cu succes.
        logsProxy.sendLogs("Transaction has been added " + LocalDateTime.now());
    }
}
