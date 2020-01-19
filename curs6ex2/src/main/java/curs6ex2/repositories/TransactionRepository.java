package curs6ex2.repositories;

import curs6ex2.entities.Card;
import curs6ex2.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    @Query("SELECT card FROM Card card WHERE card.pan = :pan")
    public List<Card> findCardsByCardPan(@Param("pan") String pan);

    @Query("SELECT t FROM Transaction t WHERE t.card = :card")
    public List<Transaction> findTransactionsByCard(@Param("card") Card card);

    // behind the scenes does a join between the two tables ('card' and 'transaction')
    // to search for the cards with a certain pan
    @Query("SELECT t FROM Transaction t WHERE t.card.pan = :pan")
    public List<Transaction> findTransactionsByCardPan(@Param("pan") String pan);

}
