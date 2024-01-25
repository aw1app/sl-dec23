package com.ecommerce.dao;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.entity.EProductEntity;

@Repository
@Transactional
public class EProductDAO {

	@Autowired
	private SessionFactory sessionFactory;

	// Business Methods

	public List<EProductEntity> getAllProducts() {
		
		Query query = this.sessionFactory.getCurrentSession().createQuery("from EProductEntity");
		
		return query.list();
	}
	
	// Add a product
	
	public void addProduct(String name, float price) {
		EProductEntity eProduct = new EProductEntity();
		eProduct.setName(name);
		eProduct.setPrice(new BigDecimal(price));		
		
		this.sessionFactory.getCurrentSession().save(eProduct);		
	}
	
	// Delete a product
	public void deleteProduct(long id) {
		Session session = this.sessionFactory.getCurrentSession();
		
		EProductEntity eProduct = (EProductEntity) session.load(EProductEntity.class, id);
		
		session.delete(eProduct);
	}

}
