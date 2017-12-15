package com.skishop.admin.usercontrol.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skishop.admin.usercontrol.dao.AdminUserDaoImpl;
import com.skishop.entity.User;

@Service
@Transactional(readOnly=true)
public class AdminUserServiceImpl {
	@Resource
	private AdminUserDaoImpl adminUserDaoImpl;	
	
	public List<User> listUsers() {
		return this.adminUserDaoImpl.findAll();
	}
	public void addproducts(User u){
		this.adminUserDaoImpl.toAddUser(u);
	}
	public void deletproducts(int userid){
		this.adminUserDaoImpl.DeletUser(userid);
	}
}
