package springlesson6e2.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import springlesson6e2.demo.entities.Card;
import springlesson6e2.demo.entities.Transaction;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    @Query("SELECT t FROM Transaction t WHERE t.card = :card")
    public List<Transaction> findTransactionsByCard(@Param("card") Card card);

    @Query("SELECT t FROM Transaction t WHERE t.card.pan = :pan")
    public List<Transaction> findTransactionsByCardPan(@Param("pan") String pan);
}
