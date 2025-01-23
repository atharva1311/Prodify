package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ProductDao;
import com.tka.entity.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao prodao;
	
	public String  addProduct(Product product) {
		
		return prodao.addProduct(product);
		
	}

	public List<Product> displayProduct() {
		List<Product> plist =prodao.displayProduct();
		return plist;
	}
	
	public Product getProduct(int pk)
	{
		return prodao.getProduct(pk);
	}
	
	public String updateProduct(Product product)
	{
		return prodao.updateProduct(product);
	}
	public String deleteProduct(int pk)
	{
		return prodao.deleteProduct(pk);
	}

	
}
