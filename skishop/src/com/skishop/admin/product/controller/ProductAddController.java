package com.skishop.admin.product.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skishop.admin.product.service.AdminProductServiceImpl;
import com.skishop.entity.Product;

@Controller
@RequestMapping
public class ProductAddController {

	@Resource
	private AdminProductServiceImpl adminProductServiceImpl;
	
	@RequestMapping("/addproducts")
	public String toAdd(HttpSession session,@RequestParam("productname") String name,@RequestParam("description") String description,
			@RequestParam("price") double price,@RequestParam("discountprice") double discountprice,
			@RequestParam("img1") String img1){
		Product p = new Product();
		p.setName(name);
		p.setDescription(description);
		p.setPrice(price);
		p.setDiscountprice(discountprice);
		p.setImg1(img1);
		this.adminProductServiceImpl.addproducts(p);;
		System.out.println(p);
		return"product_list";
	}
}
