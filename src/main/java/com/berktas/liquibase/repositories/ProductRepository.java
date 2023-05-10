package com.berktas.liquibase.repositories;


import com.berktas.liquibase.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
