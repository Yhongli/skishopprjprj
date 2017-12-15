package com.skishop.ui.cart.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.skishop.entity.CartItem;
import com.skishop.entity.Product;

@Repository
public class CartDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	public void saveCart(CartItem cart){
		Session session = this.sessionFactory.getCurrentSession();
		session.save(cart);
		session.flush();
	}
	public Product findById(int id) {
		return (Product)this.sessionFactory.getCurrentSession().get(Product.class, id);
	}
}
