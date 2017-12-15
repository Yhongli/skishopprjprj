package com.skishop.ui.product.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.skishop.entity.Product;

@Repository
public class ProductDaoImpl {
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
}
