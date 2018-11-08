package repositories;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

    public void save() {
        System.out.println("Saves something in DB");
    }
}
