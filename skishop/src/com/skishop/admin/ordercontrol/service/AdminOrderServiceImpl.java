package com.skishop.admin.ordercontrol.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skishop.admin.ordercontrol.dao.AdminOrderDaoImpl;
import com.skishop.entity.Order;

@Service
@Transactional(readOnly=true)
public class AdminOrderServiceImpl {
	@Resource
	private AdminOrderDaoImpl adminOrderDao;
	
	public List<Order> listOrders(){
		return this.adminOrderDao.findAll();
	}
	public void processorders(int id){
		this.adminOrderDao.processOrders(id);
	}
}
