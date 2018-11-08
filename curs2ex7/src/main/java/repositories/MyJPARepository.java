package repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("JPA")
public class MyJPARepository implements MyRepository {

    @Override
    public void save() {
        System.out.println("Saving using JPA");
    }
}
