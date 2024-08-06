package com.example.BEST.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.BEST.entity.Product;

public interface ProdRepository extends MongoRepository<Product,Long>{

}
