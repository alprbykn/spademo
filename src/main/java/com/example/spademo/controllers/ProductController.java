package com.example.spademo.controllers;

import com.example.spademo.model.Budget;
import com.example.spademo.model.Product;
import com.example.spademo.services.BudgetService;
import com.example.spademo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("api/v3/prodcuts")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/createProduct")
    public ResponseEntity createProduct(
            @RequestBody Product product) {
        productService.createProduct(product);

        return ResponseEntity.ok(HttpStatus.OK);
    }
    @GetMapping("/getProducts")
    public List<Product> getProducts() {
        return productService.getProducts();


    }
}