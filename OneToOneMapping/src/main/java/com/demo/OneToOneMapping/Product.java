package com.demo.OneToOneMapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int productid;
	
	@Column
	String productname;
	
	@Column
	int price;
	
	@Column
	int stock;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="pimageid", referencedColumnName = "pimageid")
	Productimage image;
	
public Product() {
	
}
public Product(int productid, String productname, int price, int stock, Productimage image) {
	super();
	this.productid = productid;
	this.productname = productname;
	this.price = price;
	this.stock = stock;
	this.image = image;
}

public Product(String productname, int price, int stock, Productimage image) {
	super();
	this.productname = productname;
	this.price = price;
	this.stock = stock;
	this.image = image;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public Productimage getImage() {
	return image;
}
public void setImage(Productimage image) {
	this.image = image;
}



}



