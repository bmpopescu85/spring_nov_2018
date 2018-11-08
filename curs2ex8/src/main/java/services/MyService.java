package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import repositories.MyRepository;

public class MyService {

    @Autowired
    @Qualifier("repo2")
    private MyRepository myRepository;

    public void test() {
        myRepository.save();
    }
}
