package com.product.services;

import java.util.List;

import com.product.entity.Product;

public interface IProductService {

	Integer addProduct(Product product);

	List<Product> getAllProducts();

}
