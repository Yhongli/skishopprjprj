package com.skishop.admin.product.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skishop.admin.product.service.AdminProductServiceImpl;
import com.skishop.entity.Product;

@Controller
@RequestMapping
public class AdminProductController {
	@Resource
	private AdminProductServiceImpl adminproductServiceImpl;
	
	@RequestMapping("/adminproductlist")
	public String skishop(HttpSession session,Product product){
		List<Product> alist=this.adminproductServiceImpl.listProducts();	
		session.setAttribute("alist", alist);
		System.out.println(alist);
		return"product_list";
	}
}
