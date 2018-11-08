package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import repositories.HelloRepository;

@Configuration
@ComponentScan(basePackages = "services")
public class ProjectConfig {

    @Bean
    public HelloRepository helloRepository() {
        return new HelloRepository();
    }
}
