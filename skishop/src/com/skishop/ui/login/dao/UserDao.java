package com.skishop.ui.login.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.skishop.entity.User;

@Repository
public class UserDao {
	
	@Resource
	private SessionFactory sessionFactory;
	public void saveUser(User user){
		Session session = this.sessionFactory.getCurrentSession();
		session.save(user);  //转变为持久化数据
		session.flush();   //强制同步数据库
	}
	
    @SuppressWarnings("unchecked")
	public List<User> findByEmail(String email,String password){
    	String hql="from User where email=? and password=?";
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter(0, email);
		query.setParameter(1, password);
		return query.list();
	}
	
}
