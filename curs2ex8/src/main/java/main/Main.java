package main;

import config.ProejctConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.MyService;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(ProejctConfig.class)) {
            context.getBean(MyService.class).test();
        }
    }
}
