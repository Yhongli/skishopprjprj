package com.skishop.ui.order.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skishop.entity.Order;
import com.skishop.entity.User;
import com.skishop.ui.order.service.OrderServiceImpl;

@Controller
@RequestMapping
public class OrderController {

	@Resource
	private OrderServiceImpl orderServiceImpl;
	
	@RequestMapping("/submitOrder")
	public String toAdd(HttpSession session,@RequestParam("productid") int productid,
			/*@RequestParam("userid") int userid,*/@RequestParam("count") int count){
		User u = (User) session.getAttribute("user");
		Order o = new Order();
		o.setProductid(productid);
		o.setCount(count);
		this.orderServiceImpl.submitOrders(o);
		System.out.println(o);
		return"order0";
	}
	
/*	@RequestMapping("/delete")
	public void delete(@RequestParam("id") int id,HttpServletRequest request,HttpServletResponse reponse){
		this.orderServiceImpl.deleteOrder(id);
		try {
			request.getRequestDispatcher("/showorder/show").forward(request, reponse);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}*/
}
