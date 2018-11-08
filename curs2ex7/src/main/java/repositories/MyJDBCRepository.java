package repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("JDBC")
public class MyJDBCRepository implements MyRepository {

    public void save() {
        System.out.println("Saving using JDBC repo");
    }
}
