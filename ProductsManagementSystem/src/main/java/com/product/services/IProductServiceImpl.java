package com.product.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.exception.ResourceNotFoundException;
import com.product.repo.IProductRepository;

@Service
public class IProductServiceImpl implements IProductService {

	@Autowired
	IProductRepository productRepository;

	@Override
	public Integer addProduct(Product product) {
		Product addProduct = productRepository.save(product);
		return addProduct.getId();
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> getProduct(Integer Id) {
		return productRepository.findById(Id);
	}

	@Override
	public Product updateProduct(Product product, Integer Id) {
		
		//we will check the product with id exists or not
		Product existingProduct = productRepository.findById(Id)
				.orElseThrow(() -> new ResourceNotFoundException("Product", "id", Id));
		
		existingProduct.setProductName(product.getProductName());
		existingProduct.setProductBrand(product.getProductBrand());
		existingProduct.setProductCategory(product.getProductCategory());
		existingProduct.setProductPrice(product.getProductPrice());
		
		//setting the updated value and save it to repo.
		productRepository.save(existingProduct);
		return existingProduct;
	}

}
