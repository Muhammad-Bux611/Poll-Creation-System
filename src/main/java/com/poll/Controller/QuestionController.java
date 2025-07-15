package com.poll.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.poll.Model.Poll;
import com.poll.Model.Question;
import com.poll.Model.User;
import com.poll.service.QuestionService;
import com.poll.service.UserService;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

@Controller
public class QuestionController {
	@Autowired
	QuestionService service;

//	Controller for show the form that should use for create the question for poll

	@RequestMapping("/poll")
	public String pollDate(Poll poll) {
		return "Question";
	}
	
	
	
//	Controller for add Question in the poll
	
	@RequestMapping(path="/addQuestion",method = RequestMethod.POST)
	public String CreateQuestion(Question question) {
		
		boolean isAdded = service.isAdded(question);
		if (isAdded) {
			
			return "poll";
		}else {
			return "Question";
		}
	}
	
	
//	Controller for show the poll to admin to perform some operation
	
	@RequestMapping(path="/showPolesToAdmin", method = RequestMethod.GET)
	public String showPolestoAdmin(Model model) {
		List<Question> questions= service.showQuestions();

		model.addAttribute("user", "admin");
		model.addAttribute("polls",questions);

		return "viewPolls";
	}
	

//	Controller for show the poll to User to vote
	
	@RequestMapping(path="/showPoles", method = RequestMethod.GET)
	public String showPoles(@RequestParam("userEmail")String email,Model model) {
		List<Question> questions= service.showQuestions();
		model.addAttribute("polls",questions);
		User users =(User) model.getAttribute("user");
		
		model.addAttribute("email",email);
	
		return "viewPolls";
	}
	
//	Controller to delete the poll by admin 
	
	@RequestMapping(path = "/deletePoll" , method =RequestMethod.GET)
	public String deletePoll(@RequestParam("questionId")String questionId) {
		int questId= Integer.parseInt(questionId);
		boolean deleted = service.isDeleted(questId);
		
		if (deleted==true) {
		
			return "delete";
		}else {
			
			return "redirect:/showPolesToAdmin";
		}
	}

//	Controller to update form the poll by admin 
	
	@RequestMapping(path = "/updatePoll", method = RequestMethod.GET)
	public String updatePoll(@RequestParam("questionId")String questionId  , Model model) {
		int questId = Integer.parseInt(questionId);
		Question question= service.getQuestion(questId);
		model.addAttribute("question", question);
		return "update";
	}
	
//	Controller to update the poll by admin 
	
	@RequestMapping(path = "/updated" , method = RequestMethod.POST)
	public String update(Question question) {
		service.update(question);
		return "redirect:/showPolesToAdmin";
	}
	
	
}
