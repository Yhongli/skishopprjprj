package com.skishop.ui.order.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.skishop.entity.Order;

@Repository
public class OrderDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	public void submitOrders(Order o){
		Session session = this.sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(o);
		session.flush();
		session.clear();
		session.getTransaction().commit();
	}
	public List<Order> selectEditOrder(int userid){
		String hql = "from Orders where userid=:userid and admitsign=1 and deletesign=0";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("userid", userid);
		return query.list();
	}
	public List<Order> selectUneditOrder(int userid){
		String hql = "from Orders where userid=:userid and admitsign=0 and deletesign=0";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("userid", userid);
		return query.list();
	}
	public void deleteOrder(int id){
		Session session=this.sessionFactory.getCurrentSession();
		Order o= session.get(Order.class, id);
		session.beginTransaction();
		o.setDeletesign(1);
		session.flush();
		session.clear();
		session.getTransaction().commit();
	}
}
