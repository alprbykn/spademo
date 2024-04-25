package com.example.spademo.services;

import com.example.spademo.model.Budget;
import com.example.spademo.model.Product;
import com.example.spademo.repo.BudgetRepository;
import com.example.spademo.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(Product product) {
         productRepository.save(product);
    }

    public List<Product> getProducts() {
       return productRepository.findAll();
    }

    public void delete() {  productRepository.deleteAll();
    }
}