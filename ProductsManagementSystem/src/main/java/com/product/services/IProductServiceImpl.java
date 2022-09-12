package com.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repo.IProductRepository;

@Service
public class IProductServiceImpl implements IProductService{

	@Autowired
	IProductRepository productRepository;
	
	@Override
	public Integer addProduct(Product product) {
		Product addProduct = productRepository.save(product);
		return addProduct.getId();
	}
	
	@Override
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}

}
