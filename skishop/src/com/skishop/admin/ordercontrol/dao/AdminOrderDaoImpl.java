package com.skishop.admin.ordercontrol.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.skishop.entity.Order;

@Repository
public class AdminOrderDaoImpl {

	@Resource
	private SessionFactory sessionFactory;
	/**
	 * 查询全部订单
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Order> findAll(){
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from orders"); 
		query.addEntity(Order.class);
		List<Order> olist = query.list();
		ts.commit();
		return olist;
	}
	public void processOrders(int id){
    	Session session = this.sessionFactory.getCurrentSession();
		Order o = session.get(Order.class, id);
		Transaction ts = session.beginTransaction();
		session.delete(o);
		session.flush();
		session.clear();
		ts.commit();
	}
}
