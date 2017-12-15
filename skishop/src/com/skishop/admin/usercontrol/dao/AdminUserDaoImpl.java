package com.skishop.admin.usercontrol.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.skishop.entity.User;

@Repository
public class AdminUserDaoImpl {

	@Resource
	private SessionFactory sessionFactory;
	/**
	 * 查询全部用户
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<User> findAll(){
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from user"); 
		query.addEntity(User.class);
		List<User> list = query.list();
		ts.commit();
		return list;
	}
	public void toAddUser(User u){
		Session session = this.sessionFactory.getCurrentSession();
		Transaction ts = session.beginTransaction();
		session.save(u);  //转变为持久化数据
		session.flush();   //强制同步数据库
		session.clear();
		ts.commit();
	}
	public void DeletUser(int userid){
    	Session session = this.sessionFactory.getCurrentSession();
		User u = session.get(User.class, userid);
		Transaction ts = session.beginTransaction();
		session.delete(u);
		session.flush();
		session.clear();
		ts.commit();
	}
}
