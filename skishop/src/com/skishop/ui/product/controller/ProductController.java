package com.skishop.ui.product.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.skishop.entity.Product;
import com.skishop.ui.product.service.ProductServiceImpl;

@Controller
@RequestMapping
public class ProductController {

	@Resource
	private ProductServiceImpl productServiceImpl;
	
	@RequestMapping("/productlist")
	public String skishop(HttpSession session,Product product){
		List<Product> list=this.productServiceImpl.listProducts();	
		session.setAttribute("list", list);
		System.out.println(list);
		return"shop";
	}
}
