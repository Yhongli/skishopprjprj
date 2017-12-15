package com.skishop.ui.cart.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skishop.ui.cart.service.Cart;
import com.skishop.ui.cart.service.CartServiceImpl;

@Controller
@RequestMapping("/cart")
public class CartController {

	@Resource
	private CartServiceImpl cartServiceImpl;
	
	@RequestMapping("/cartadd")
	public String addCart(@RequestParam("productId") String productid,HttpSession session){
		Cart c=(Cart)session.getAttribute("cart");
		c= this.cartServiceImpl.add(Integer.parseInt(productid),c);
		session.setAttribute("cart", c);
		return "redirect:/shop.jsp";
	}	
	
}
