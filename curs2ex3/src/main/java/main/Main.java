package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.HelloService;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            context.getBean(HelloService.class).hello();
        }
    }
}
