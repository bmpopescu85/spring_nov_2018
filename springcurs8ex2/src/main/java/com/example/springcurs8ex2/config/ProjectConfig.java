package com.example.springcurs8ex2.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@EnableWebSecurity
@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsManager userDetailsManager() {
        return new InMemoryUserDetailsManager();
    }

    @Bean
    public InitializingBean initializingBean(UserDetailsManager userDetailsManager) {
        return () -> {
            UserDetails user1 =
                    User.withDefaultPasswordEncoder()
                            .username("bill")
                            .password("12345")
                            .authorities("ADMIN")
                            .build();
            UserDetails user2 =
                    User.withDefaultPasswordEncoder()
                            .username("john")
                            .password("12345")
                            .authorities("ADMIN")
                            .build();
            userDetailsManager.createUser(user1);
            userDetailsManager.createUser(user2);
        };
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();

        http.authorizeRequests()
                .mvcMatchers(HttpMethod.GET, "/hello").permitAll()
                .anyRequest().authenticated();

    }
}
