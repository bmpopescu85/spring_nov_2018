package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"repositories", "services"})
@EnableTransactionManagement
public class ProjectConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource =
                new DriverManagerDataSource();

        // manually create the database 'springcurs4' before running the program
        dataSource.setUrl("jdbc:mysql://localhost/springcurs4");
        dataSource.setUsername("root");
        // set the password for local env MySQL server:
        dataSource.setPassword("");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    // OR:
    // @Bean
    // public JdbcTemplate jdbcTemplate(DataSource dataSource) {
    //    return new JdbcTemplate(dataSource);
    // }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    // Note: Both jdbcTemplate and transactionManager will receive
    // the same instance for dataSource (it's a singleton by default)
}
