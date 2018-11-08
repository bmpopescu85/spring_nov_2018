package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import repositories.MyRepository;

@Service
public class MyService {

    @Autowired
    @Qualifier("JPA")
    private MyRepository myRepository;

    public void test() {
        myRepository.save();
    }
}
