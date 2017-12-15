package com.skishop.ui.order.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.skishop.entity.Order;
import com.skishop.ui.order.dao.OrderDaoImpl;

@Service
public class OrderServiceImpl {
	@Resource
	private OrderDaoImpl orderDaoImpl;
	
	public void submitOrders(Order o){
		this.orderDaoImpl.submitOrders(o);
	}
	public List<Order> showEditOrder(int userid){
		return this.orderDaoImpl.selectEditOrder(userid);
	}
	public List<Order> showUneditOrder(int userid){
		return this.orderDaoImpl.selectUneditOrder(userid);
	}
	public void deleteOrder(int id){
		this.orderDaoImpl.deleteOrder(id);
	}
}
