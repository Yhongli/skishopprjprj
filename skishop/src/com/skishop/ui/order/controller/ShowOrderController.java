package com.skishop.ui.order.controller;

import java.io.IOException;
import java.util.List;

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
@RequestMapping("/showorder")
public class ShowOrderController {
	@Resource
	private OrderServiceImpl orderserviceImpl;
	@RequestMapping("/show")
	public String show(HttpSession session){
		User u = (User) session.getAttribute("user");
		List<Order> el = this.orderserviceImpl.showEditOrder(u.getUserid());
		session.setAttribute("ordereditlist", el);
		List<Order> uel = this.orderserviceImpl.showUneditOrder(u.getUserid());
		session.setAttribute("orderuneditlist", uel);
		return "success";
	}
	@RequestMapping("/delete")
	public void delete(@RequestParam("id") int id,HttpServletRequest request,HttpServletResponse reponse){
		this.orderserviceImpl.deleteOrder(id);
		try {
			request.getRequestDispatcher("/showorder/show").forward(request, reponse);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}
