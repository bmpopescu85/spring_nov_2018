package main;

import beans.Cat;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            context.getBean(Cat.class).sayMeow();
        }
    }
}
