package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repositories.MyRepository;
import services.MyService;

@Configuration
public class ProejctConfig {

    @Bean
    @Qualifier("repo1")
    public MyRepository repo1() {
        return new MyRepository();
    }

    @Bean
    @Qualifier("repo2")
    public MyRepository repo2() {
        return new MyRepository();
    }

    @Bean
    public MyService service() {
        return new MyService();
    }
}
