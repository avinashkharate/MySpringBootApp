package com.example.MySpringBootApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductUIController {

    @GetMapping(value = "/product", produces = "text/html")
    public String productForm() {
        return "product"; // Add form (POST)
    }

    @GetMapping(value = "/products", produces = "text/html")
    public String productList() {
        return "products"; // List page (GET)
    }

    @GetMapping(value = "/product-edit", produces = "text/html")
    public String editProductPage() {
        return "product-edit"; // Edit form (PUT)
    }
}
