package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Product;

@Repository
public class ProductDao {

	@Autowired
	private SessionFactory factory;
	
	public String addProduct(Product product) {
	   
		try {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(product);
			tx.commit();
			
			return "Product added successfully...!";	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "Something went wrong..!";
		}
		
		
	}

	public List<Product> displayProduct() {
		List<Product> plist =null;
		try
		{
			Session session= factory.openSession();
			Criteria criteria = session.createCriteria(Product.class);
			plist=criteria.list();
			return plist;
		}
		catch (Exception e) {
			e.printStackTrace();
			
			return plist;
		}
		
	}
	
//	public Product getProduct(int pk)
//	{
//		Product product=null;
//		try {
//			Session session = factory.openSession();
//			product=session.get(Product.class, pk);
//			return product;
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			return product;
//		}
//	}
	
	public Product getProduct(int pk)
	{
		Product product = null;
		try {
			Session session = factory.openSession();


			product = session.get(Product.class, pk);
	
			return product;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return product;
		}
	}
	
	public String updateProduct(Product product)
	{
		try {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(product);
			tx.commit();
			return "Product updated successfully...!";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "Something went wrong..!";
		}
	}
	
	public String deleteProduct(int pk)
	{
		Product product=null;
		try {
			
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			product=session.get(Product.class, pk);
			session.delete(product);
			tx.commit();
			return "Product deleted successfully...!";
			
					
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "Something went wrong..!";
		}
	}
	
	

}
