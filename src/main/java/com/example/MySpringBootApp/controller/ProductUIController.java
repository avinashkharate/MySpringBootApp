package com.example.MySpringBootApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductUIController {

    @GetMapping("/products")
    public String productsPage() {
        return "products"; // products.html from /templates
    }

    @GetMapping("/product")
    public String addProductPage() {
        return "product"; // product.html from /templates
    }

    @GetMapping("/product-edit")
    public String editProductPage() {
        return "product"; // reuse same form page
    }
}