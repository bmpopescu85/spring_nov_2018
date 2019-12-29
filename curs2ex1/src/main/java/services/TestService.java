package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repositories.TestRepository;

/*
@Component, @Service, @Repository, @Controller
 */
@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    // trebuie sa am constructor fara parametri
    // in acest caz avem contructorul default

    public void helloService() {
        System.out.println("Hello World!");
        testRepository.save();
    }
}
