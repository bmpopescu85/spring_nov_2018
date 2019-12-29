package config;

import beans.Dog;
import beans.Human;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    public Dog dog1() {
        Dog dog = new Dog();
        dog.setColor("Brown");
        return dog;
    }

    @Bean
    public Dog dog2() {
        Dog dog = new Dog();
        dog.setColor("Black");
        return dog;
    }

    @Bean
    public Human h1() {
        Human h1 = new Human();
        h1.setDog(dog1());
        // if already exists a Dog in context get it from there, else create it
        return h1;
    }
}
