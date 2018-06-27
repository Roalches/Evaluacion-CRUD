package com.example.demo.administration;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.products.Products;
import com.example.demo.storage.Storage;

@RestController
@RequestMapping("/api")
public class Administration {

	@Autowired
	private Storage storage;
	
	@GetMapping("/products")
	public List<Products> getProducts(){
		return storage.findAll();
	}
	
	@GetMapping("/products/{productid}")
	public Optional<Products> getProducts(@PathVariable Long productid){
		return storage.findById(productid);
	}
	@DeleteMapping("/products/{productid}")
	public boolean deleteProduct(@PathVariable Long productid) {
		boolean status;
		try {
			storage.deleteById(productid);
			status = true;
		}
		catch(Exception e){
			status = false;
		}
		return status;
	}
	
	@PostMapping("/products")
	public Products createProduct(Products product) {
		return storage.save(product);
	}
	@PutMapping("/products")
	public Products updateProduct(Products product) {
		return storage.save(product);
	}
	
}
