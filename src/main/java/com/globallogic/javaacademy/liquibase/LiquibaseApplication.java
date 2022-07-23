package com.globallogic.javaacademy.liquibase;

import com.globallogic.javaacademy.liquibase.entity.Farmer;
import com.globallogic.javaacademy.liquibase.repository.FarmerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class LiquibaseApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(LiquibaseApplication.class, args);
        final FarmerRepository farmerRepository = applicationContext.getBean(FarmerRepository.class);
        final List<Farmer> farmers = farmerRepository.findAll();
    }

}
