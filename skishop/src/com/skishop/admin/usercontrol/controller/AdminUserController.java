package com.skishop.admin.usercontrol.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skishop.admin.usercontrol.service.AdminUserServiceImpl;
import com.skishop.entity.User;

@Controller
@RequestMapping
public class AdminUserController {
	@Resource
	private AdminUserServiceImpl adminUserServiceImpl;
	
	@RequestMapping("/adminuserlist")
	public String userlist(HttpSession session,User u){
		List<User> aulist=this.adminUserServiceImpl.listUsers();	
		session.setAttribute("aulist", aulist);
		System.out.println(aulist);
		return"user_list";
	}
	@RequestMapping("/addusers")
	public String toAddUser(HttpSession session,@RequestParam("username") String name,@RequestParam("password") String password,
			@RequestParam("email") String email,@RequestParam("address") String address){
		User u = new User();
		u.setName(name);
		u.setAddress(address);
		u.setEmail(email);
		u.setPassword(password);
		this.adminUserServiceImpl.addproducts(u);
		System.out.println(u);
		return"user_list";
	}
	@RequestMapping("/deletusers")
	public String deletuser(@RequestParam("userid")int id){
		this.adminUserServiceImpl.deletproducts(id);
		System.out.println(id);
		return"user_list";
	}
}
