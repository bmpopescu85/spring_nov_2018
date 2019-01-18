package com.example.springcurs7e2.controllers;

import com.example.springcurs7e2.model.Transaction;
import com.example.springcurs7e2.proxy.LogsProxy;
import com.example.springcurs7e2.repositories.TransactionRepository;
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
        logsProxy.sendLogs("Transaction has been added " + LocalDateTime.now());
    }
}
