package com.example.BEST.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BEST.entity.Product;
import com.example.BEST.repo.ProdRepository;
@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	ProdRepository productrepo;
	
	@Override
	public String saveProduct(Product product) {
		productrepo.save(product);
		return "Product id:" + product.getProdId()+"successfully created";
	}
	
	@Override
	public List<Product> getAllProduct() {
		return productrepo.findAll();
	}
	
	@Override
	public Product getProductById(long prodId) {
		return productrepo.findById(prodId).get();
	}
	@Override
	public String deleteByProductById(long prodId){
		boolean delete = false;
		if(productrepo.existsById(prodId)) {
			productrepo.deleteById(prodId);
			delete= true;
		}
		return "status of"+prodId+"is"+delete;
	}
}
