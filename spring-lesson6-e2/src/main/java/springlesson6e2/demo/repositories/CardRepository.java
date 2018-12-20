package springlesson6e2.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springlesson6e2.demo.entities.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
}
