package com.skishop.ui.login.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skishop.entity.User;
import com.skishop.ui.login.service.LoginServiceImpl;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Resource
	private LoginServiceImpl loginServiceImpl;
	
	@RequestMapping("/login")
	public String login(@RequestParam("email") String email,@RequestParam("password") String password,Model model, HttpSession session){
		User u=this.loginServiceImpl.login(email, password);
		if(u!=null){
			session.setAttribute("u", u);
			model.addAttribute("info","欢迎");
			return "redirect:/shop.jsp";
		}else{
			model.addAttribute("errorinfo", "您的账号密码不正确！");
			return "redirect:/login.jsp";
		}
	}
}
