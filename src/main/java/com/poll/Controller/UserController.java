package com.poll.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.poll.Model.Question;
import com.poll.Model.User;
import com.poll.Model.Vote;
import com.poll.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	
//	Controller for show the registration form for user
	
	@RequestMapping(path = "/register")
	public String registerForm() {
		return "registerUser";
	}
	
//	Controller for fetch the data from view and save that to the database
	
	@RequestMapping(path="/registerUser", method = RequestMethod.POST)
	public String registerUser(User user) {
		int saved=service.isSaved(user);
		if (saved!=0) {
		
			return "userLogin";
	}else {
		return "viewPolls";
	}
	}
	
	
//	Controller to check the data form the database and login
	
	@RequestMapping(path="/loginUser", method=RequestMethod.POST)
	public String loginUser(User user,Model model) {
		boolean login = service.isLogin(user);
		if (login) {

			model.addAttribute("user",user);
			System.out.println("User Login Successfully..");
			System.out.println(user);
			return "redirect:/showPoles?userEmail="+user.getEmail();
		}else {
			return "userLogin";
		}
	}
	
	@RequestMapping(path = "/updateUser", method =RequestMethod.GET)
	public String updateUser(@RequestParam("voteId")String voteId, @RequestParam("userEmail")String userEmail) {
		System.out.println(voteId);
		System.out.println(userEmail);
		System.out.println("The data is successfully deleted....");
		Vote vote=new Vote();
		int intVote = Integer.parseInt(voteId);
		vote.setVoteId(intVote);
		User user = service.getUserByEmail(userEmail);
		
		boolean isUpdate = service.isUpdate(user);
		if (isUpdate) {
			System.out.println("The data is successfully update");
			return "success";
		}else {
		return "userLogin";
	}
	}
	
	@RequestMapping("/getUser")
	public String getUser(@RequestParam("userEmail")String userEmail,@RequestParam("questionId")String question, 
			@RequestParam("voteOption") String voteOption,HttpServletRequest req) {
		User user = service.getUserByEmail(userEmail);
		
		HttpSession session =req.getSession();
		session.setAttribute("user", user);
		session.setAttribute("question", question);
		session.setAttribute("voteOption", voteOption);
		
		
		return "redirect:/vote";
	}
}
