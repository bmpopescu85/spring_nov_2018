package config;

import aspect.HelloAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"service"})
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public HelloAspect aspect() {
        return new HelloAspect();
    }

}
