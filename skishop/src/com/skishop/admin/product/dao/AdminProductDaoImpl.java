package com.skishop.admin.product.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.skishop.entity.Product;
@Repository
public class AdminProductDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	/**
	 * 查询全部产品
	 * @return
	 */
    @SuppressWarnings("unchecked")
	public List<Product> findAll() {
    	//获得session  
        Session session = sessionFactory.openSession();  
        //打开事务  
        Transaction ts = session.beginTransaction();
        //原生的Sql查询  
        SQLQuery query = session.createSQLQuery("select * from product");  
        // addEntity 将查询结果封装到指定对象中  
        query.addEntity(Product.class);  	          
        List<Product> list = query.list();            
        //提交事务  
        ts.commit();        
        //关闭资源  
        session.close(); 
        return list;
	}
    public void toAddProduct(Product p){
		Session session = this.sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(p);  //转变为持久化数据
		session.flush();   //强制同步数据库
		session.clear();
		session.getTransaction().commit();
    }
    public void DeletProduct(int id){
    	Session session = this.sessionFactory.getCurrentSession();
		Product p = session.get(Product.class, id);
		session.beginTransaction();
		session.delete(p);
		session.flush();
		session.clear();
		session.getTransaction().commit();
    }
}
