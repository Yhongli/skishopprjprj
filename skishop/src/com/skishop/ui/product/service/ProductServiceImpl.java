package com.skishop.ui.product.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.skishop.entity.Product;
import com.skishop.ui.product.dao.ProductDaoImpl;

@Service
public class ProductServiceImpl {
	@Resource
	private ProductDaoImpl productDaoImpl;	
	
	public List<Product> listProducts() {
		return this.productDaoImpl.findAll();
	}
}
