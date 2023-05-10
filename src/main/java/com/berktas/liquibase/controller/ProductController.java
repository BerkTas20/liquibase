package com.berktas.liquibase.controller;

import com.berktas.liquibase.model.Product;
import com.berktas.liquibase.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @PostConstruct
    private void createIfNotExist(){
        Long count = productRepository.count();
        if(count == 0){
            Product product = new Product();
            product.setName("firstProduct");
            productRepository.save(product);
        }
    }

    @GetMapping
    List<Product> getAll(){
        return productRepository.findAll();
    }
}
