package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.TestService;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            TestService testService = context.getBean(TestService.class);
            testService.helloService();
        }

    }
}
