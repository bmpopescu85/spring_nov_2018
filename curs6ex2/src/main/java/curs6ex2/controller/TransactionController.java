package curs6ex2.controller;

import curs6ex2.entities.Card;
import curs6ex2.entities.Transaction;
import curs6ex2.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    // test with 'http://localhost:8081/findCardsByCardPan/666999'
    @GetMapping("/findCardsByCardPan/{pan}")
    public List<Card> findCardsByCardPan(@PathVariable("pan") String name) {
        return transactionService.findCardsByCardPan(name);
    }

    /*
    @PutMapping("/getcard")
    public List<Transaction> findTransactionsByCard(@RequestBody Card card) {
        return transactionService.findTransactionsByCard(card);
    }
    */

    // test with 'http://localhost:8081/findTransactionsByCardPan/666999'
    @GetMapping("/findTransactionsByCardPan/{pan}")
    public List<Transaction> findTransactionsByCardPan(@PathVariable("pan") String name) {
        return transactionService.findTransactionsByCardPan(name);
    }


}
