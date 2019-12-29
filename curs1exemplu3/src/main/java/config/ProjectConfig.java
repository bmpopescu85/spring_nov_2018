package config;

import beans.Dog;
import beans.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Dog dog1() {
        Dog dog = new Dog();
        dog.setColor("Brown");
        return dog;
    }

    @Bean
    // @Autowired - no need from version 3.2
    public Human h1(Dog dog1) {
        Human h1 = new Human();
        h1.setDog(dog1);
        return h1;
    }
}
