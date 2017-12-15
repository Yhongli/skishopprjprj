package com.skishop.admin.ordercontrol.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skishop.admin.ordercontrol.service.AdminOrderServiceImpl;
import com.skishop.entity.Order;

@Controller
@RequestMapping
public class AdminOrderController {

	@Resource
	private AdminOrderServiceImpl adminOrderService;
	@RequestMapping("/adminorderlist")
	private String orderlist(HttpSession session,Order o){
		List<Order>aolist=this.adminOrderService.listOrders();
		session.setAttribute("aolist", aolist);
		System.out.println(aolist);
		return"order_list";
	}
	
	@RequestMapping("/processorder")
	public String deletuser(@RequestParam("orderid")int id){
		this.adminOrderService.processorders(id);
		System.out.println(id);
		return"order_list";
	}
}
