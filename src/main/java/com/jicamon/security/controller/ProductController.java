package com.jicamon.security.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private record Product(Long productId, String productName, Double price) {}

    List<Product> products = List.of(
        new Product(1L, "Laptop", 999.99),
        new Product(2L, "Smartphone", 499.99),
        new Product(3L, "Tablet", 299.99)
    );

    @GetMapping
    public List<Product> getAllProducts() {

        return products;

    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product){

        products.add(product);
        return product;

    }
}
