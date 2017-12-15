package com.skishop.ui.login.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.skishop.entity.User;
import com.skishop.ui.login.dao.UserDao;

@Service
public class RegisterServiceImpl {
	@Resource
	private UserDao userdao;
	
	public void addUser(User u){
		this.userdao.saveUser(u);
	}
}
