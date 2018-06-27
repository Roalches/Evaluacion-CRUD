package com.example.demo.products;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Products {
	
	
	@Id
	@GeneratedValue
	private Long productid;
	private String description;
	private int price;
	
	public Products(String description, int price) {
		super();
		this.setDescription(description);
		this.setPrice(price);
	}
	
	public Products() {
	}
	
	public Long getproductid() {
		return productid;
	}
	public void setproductid(Long productid) {
		this.productid = productid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
