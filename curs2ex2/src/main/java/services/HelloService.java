package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.HelloRepository;

@Component
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    public void hello() {
        helloRepository.save();
    }
}
