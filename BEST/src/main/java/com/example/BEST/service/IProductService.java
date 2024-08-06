package com.example.BEST.service;

import java.util.List;

import com.example.BEST.entity.Product;

public interface IProductService {
	String saveProduct(Product product);
	List<Product> getAllProduct();
	Product getProductById(long prodId);
	String deleteByProductById(long prodId);
	}
