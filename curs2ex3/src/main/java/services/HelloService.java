package services;

import repositories.HelloRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class HelloService {

    @Inject
    private HelloRepository helloRepository;

    public void hello() {
        helloRepository.save();
    }
}
