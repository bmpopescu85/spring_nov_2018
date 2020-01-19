package curs6ex2.service;

import curs6ex2.entities.Card;
import curs6ex2.entities.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import curs6ex2.repositories.TransactionRepository;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Card> findCardsByCardPan(String pan) {
        return transactionRepository.findCardsByCardPan(pan);
    }

    public List<Transaction> findTransactionsByCard(Card card) {
        return transactionRepository.findTransactionsByCard(card);
    }

    public List<Transaction> findTransactionsByCardPan(String pan) {
        return transactionRepository.findTransactionsByCardPan(pan);
    }


}
