package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ProductService;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            context.getBean(ProductService.class).addTenProducts();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
