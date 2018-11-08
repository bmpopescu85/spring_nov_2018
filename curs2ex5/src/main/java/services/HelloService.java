package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.HelloRepository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    @PostConstruct
    public void init() {
        helloRepository.doSomething();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroyed");
    }

    public void test() {

    }
}
