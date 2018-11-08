package repositories;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    public void save() {
        System.out.println("Save");
    }
}
