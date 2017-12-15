package com.skishop.ui.login.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.skishop.entity.User;
import com.skishop.ui.login.dao.UserDao;

@Service
public class LoginServiceImpl {
	@Resource
	private UserDao userdao;
	
	public User login(String email, String password){
		List<User> u=this.userdao.findByEmail(email,password);
		for(User user:u){
			if(user.getPassword().equals(password)){
				System.out.println("密码正确");
				return user;
			}
			else{
				return  null;
			}
		}
		return null;
	}
}
