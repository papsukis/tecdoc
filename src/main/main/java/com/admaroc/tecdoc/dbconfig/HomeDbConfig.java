package com.admaroc.tecdoc.dbconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "homeEntityManager",
        basePackages = { "com.admaroc.tecdoc.tecdoc.repository" },
        transactionManagerRef = "homeTransactionManager"
)
public class HomeDbConfig {

    @Autowired
    private Environment env;

    @Primary
    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource dataSource= new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));

        return dataSource;
    }



    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean homeEntityManager(EntityManagerFactoryBuilder builder) {

        return builder
                .dataSource(dataSource())
                .packages("com.admaroc.tecdoc.tecdoc.model")
                .persistenceUnit("home")
                .build();
    }


    @Primary
    @Bean
    public PlatformTransactionManager homeTransactionManager(@Qualifier("homeEntityManager") EntityManagerFactory homeEntityManager) {

        JpaTransactionManager transactionManager= new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(homeEntityManager);
        return transactionManager;
    }
}


