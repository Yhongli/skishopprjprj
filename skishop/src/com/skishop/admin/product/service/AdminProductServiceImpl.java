package com.skishop.admin.product.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skishop.admin.product.dao.AdminProductDaoImpl;
import com.skishop.entity.Product;
@Service
@Transactional(readOnly=true)
public class AdminProductServiceImpl {
	@Resource
	private AdminProductDaoImpl adminproductDaoImpl;	
	
	public List<Product> listProducts() {
		return this.adminproductDaoImpl.findAll();
	}
	public void addproducts(Product p){
		this.adminproductDaoImpl.toAddProduct(p);
	}
	public void deletproducts(int id){
		this.adminproductDaoImpl.DeletProduct(id);
	}
}
