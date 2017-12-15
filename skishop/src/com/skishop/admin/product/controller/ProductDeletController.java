package com.skishop.admin.product.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skishop.admin.product.service.AdminProductServiceImpl;
import com.skishop.entity.Product;

@Controller
@RequestMapping("/deletproducts")
public class ProductDeletController {
	@Resource
	private AdminProductServiceImpl adminProductServiceImpl;
	@RequestMapping
	public String Delet(@RequestParam("productid")int id){
		this.adminProductServiceImpl.deletproducts(id);
		System.out.println(id);
		return"product_list";
	}
	public String skishop(HttpSession session,Product product){
		List<Product> alist=this.adminProductServiceImpl.listProducts();	
		session.setAttribute("alist", alist);
		System.out.println(alist);
		return"product_list";
	}
}
