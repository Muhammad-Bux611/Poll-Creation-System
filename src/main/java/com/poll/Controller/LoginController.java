package com.poll.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
//	Controller for show the index page
	
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
//	Controller for the the login page for user
	
	@RequestMapping(path="/user")
	public String showloginUser() {
		return "userLogin";
	}
	
//	Controller for the login page for admin
	
	@RequestMapping(path="/admin")
	public String showloginAdmin() {
		return "adminLogin";
	}

	
	
}
