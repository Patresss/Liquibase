package com.globallogic.javaacademy.liquibase.repository;

import com.globallogic.javaacademy.liquibase.entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {
}
