package com.example.MySpringBootApp.controller;


import com.example.MySpringBootApp.entity.Product;
import com.example.MySpringBootApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @PostMapping("/product")
    public Product save(@RequestBody Product product) {
        return repo.save(product);
    }

    @GetMapping("/products")
    public List<Product> getAll() {
        return repo.findAll();
    }

    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        Optional<Product> existingProductOpt = repo.findById(id);
        if (existingProductOpt.isPresent()) {
            Product existingProduct = existingProductOpt.get();
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setPrice(updatedProduct.getPrice());
            return repo.save(existingProduct);
        } else {
            throw new RuntimeException("Product not found with id " + id);
        }
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Product deleted successfully with id " + id;
        } else {
            throw new RuntimeException("Product not found with id " + id);
        }
    }

}