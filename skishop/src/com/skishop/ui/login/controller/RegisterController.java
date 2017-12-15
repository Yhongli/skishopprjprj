package com.skishop.ui.login.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skishop.entity.User;
import com.skishop.ui.login.service.RegisterServiceImpl;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@Resource
	private RegisterServiceImpl registerServiceImpl;
	
	@RequestMapping("/adduser")
	public String toAdd(HttpSession session,@RequestParam("username") String name,@RequestParam("email") String email,
			@RequestParam("password") String password,@RequestParam("address") String address){
		User u  = new User();
		u.setName(name);
		u.setEmail(email);
		u.setPassword(password);
		u.setAddress(address);
		this.registerServiceImpl.addUser(u);
		return "redirect:/login.jsp";
	}
	
}
