package com.example.spademo.repo;

import com.example.spademo.model.Budget;
import com.example.spademo.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
