package main;

import beans.Dog;
import beans.Human;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            Dog dog = context.getBean("dog1", Dog.class); // by type
            System.out.println(dog);

            Human h1 = context.getBean(Human.class);
            System.out.println(h1);
        }

    }
}
