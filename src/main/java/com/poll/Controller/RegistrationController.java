package com.poll.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.poll.Configuration.Config;
import com.poll.DAO.AdminDAO;
import com.poll.DAO.AdminDaoImpl;
import com.poll.Model.Admin;
import com.poll.service.AdminService;

@Controller
public class RegistrationController {
	
	@Autowired
	AdminService adminService;
	
	public RegistrationController() {
		// TODO Auto-generated constructor stub
	}
	
	
//	Controller for registration form for admin

	@RequestMapping(path="/registerAdmin")
	public String registerForm(Admin admin) {
		
		return "registerAdmin";
	}
	
	
//	Controller for fetch the data and save that 
	
	@RequestMapping(path = "/register" , method = RequestMethod.POST)
	public String registerAdmin(Admin admin) {
		
		int saved=adminService.registerAdmin(admin);
		if (saved!=0) {
			System.out.println("The data is successfully inserted");
			return "adminLogin";
		}else {
			System.out.println("Something went to wrong...");
			return "registerAdmin";
		}
	}
	
//	Controller for check the login By admin
	
	@RequestMapping("/login")
	public String loginAdmin(Admin admin) {
		boolean login = adminService.isLogin(admin);
		if (login) {
			System.out.println("Login Successful");
			return "poll";
		}else {
			return "adminLogin";
		}
	}
	
}
