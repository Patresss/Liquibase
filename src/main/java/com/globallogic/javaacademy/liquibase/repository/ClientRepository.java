package com.globallogic.javaacademy.liquibase.repository;

import com.globallogic.javaacademy.liquibase.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
