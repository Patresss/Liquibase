package com.globallogic.javaacademy.liquibase;

import com.globallogic.javaacademy.liquibase.entity.Client;
import com.globallogic.javaacademy.liquibase.repository.ClientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class LiquibaseApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(LiquibaseApplication.class, args);
        final ClientRepository clientRepository = applicationContext.getBean(ClientRepository.class);
        final List<Client> clients = clientRepository.findAll();
    }

}
