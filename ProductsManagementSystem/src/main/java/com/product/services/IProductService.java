package com.product.services;

import java.util.List;
import java.util.Optional;

import com.product.entity.Product;

public interface IProductService {

	Integer addProduct(Product product);

	List<Product> getAllProducts();

	Optional<Product> getProduct(Integer Id);
	
	Product updateProduct(Product product,Integer Id);
	
	public void deleteProduct(Integer Id);
	
	public void deleteAllProducts();

}
