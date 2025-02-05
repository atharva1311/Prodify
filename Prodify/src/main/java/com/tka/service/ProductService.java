package com.tka.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ProductDao;
import com.tka.entity.Product;
import com.tka.exception.ProductNotFoundException;

@Service
public class ProductService {

	@Autowired
	private ProductDao prodao;
	
	@Transactional
	public String addProduct(@Valid Product product) {
		return prodao.addProduct(product);
	}

	public List<Product> displayProduct() {
		return prodao.displayProduct();
	}

	public Product getProduct(int pk) {
		Optional<Product> optionalProduct = Optional.ofNullable(prodao.getProduct(pk));
		return optionalProduct.orElseThrow(() -> new ProductNotFoundException("Product not found with ID: " + pk));
	}

	@Transactional
	public String updateProduct(@Valid Product product) {
		if (prodao.getProduct(product.getPid()) == null) {
			throw new ProductNotFoundException("Cannot update: Product not found with ID: " + product.getPid());
		}
		return prodao.updateProduct(product);
	}

	@Transactional
	public String deleteProduct(int pk) {
		if (prodao.getProduct(pk) == null) {
			throw new ProductNotFoundException("Cannot delete: Product not found with ID: " + pk);
		}
		return prodao.deleteProduct(pk);
	}
}
