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
		try (Session session = factory.openSession()) {  // Ensure session is closed
			Transaction tx = session.beginTransaction();
			session.save(product);
			tx.commit();
			return "Product added successfully!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Something went wrong!";
		}
	}

	public List<Product> displayProduct() {
		try (Session session = factory.openSession()) {
			Criteria criteria = session.createCriteria(Product.class);
			return criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Product getProduct(int pk) {
		try (Session session = factory.openSession()) {
			return session.get(Product.class, pk);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String updateProduct(Product product) {
		try (Session session = factory.openSession()) {
			Transaction tx = session.beginTransaction();
			session.update(product);
			tx.commit();
			return "Product updated successfully!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Something went wrong!";
		}
	}

	public String deleteProduct(int pk) {
		try (Session session = factory.openSession()) {
			Product product = session.get(Product.class, pk);
			if (product != null) {
				Transaction tx = session.beginTransaction();
				session.delete(product);
				tx.commit();
				return "Product deleted successfully!";
			} else {
				return "Product not found!";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "Something went wrong!";
		}
	}
}
