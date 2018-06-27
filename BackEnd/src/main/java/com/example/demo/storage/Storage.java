package com.example.demo.storage;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.products.Products;

public interface Storage extends JpaRepository<Products, Long>{

}
