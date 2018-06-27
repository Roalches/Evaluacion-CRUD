package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.products.Products;
import com.example.demo.storage.Storage;

@SpringBootApplication
public class BackEndApplication implements CommandLineRunner{

	@Autowired
	private Storage storage;
	public static void main(String[] args) {
		SpringApplication.run(BackEndApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		storage.save(new Products("bajsdkn", 465312));
		storage.save(new Products("afsasd" , 88465));
		storage.save(new Products("afsafs" , 4684531));
		storage.save(new Products("gredsa" , 846456));
	}
}
