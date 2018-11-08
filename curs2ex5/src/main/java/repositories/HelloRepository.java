package repositories;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    public void doSomething() {
        System.out.println("Do something...");
    }
}
