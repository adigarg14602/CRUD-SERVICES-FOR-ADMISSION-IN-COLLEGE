package com.example.BEST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BEST.entity.Product;
import com.example.BEST.service.IProductService;

@RestController
@RequestMapping("/product/")
public class ProductController {
	@Autowired
	IProductService iproductservice;
	@RequestMapping("/adi")
    public String AHello(){
        return "hello2";
    }
	@PostMapping("/save")
	public ResponseEntity<String> createProduct(@RequestBody Product product){
	return new ResponseEntity<String>(iproductservice.saveProduct(product),HttpStatus.OK)	;
	}
	@GetMapping("/get")
	public ResponseEntity<List<Product>> readallProduct(){
		return new ResponseEntity<List<Product>>(iproductservice.getAllProduct(),HttpStatus.OK);
		}
	@GetMapping("/get/{prodId}")
	public ResponseEntity<Product> readProductById(@PathVariable long prodId){
		return new ResponseEntity<Product>(iproductservice.getProductById(prodId),HttpStatus.OK);
		}

	@DeleteMapping("/delete/{prodId}")
	public ResponseEntity<String> deleteProductById(@PathVariable long prodId){
	return new ResponseEntity<String>(iproductservice.deleteByProductById(prodId),HttpStatus.OK)	;
	}

}
