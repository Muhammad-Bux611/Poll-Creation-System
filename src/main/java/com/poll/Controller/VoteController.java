package com.poll.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.poll.DAO.VoteDAO;
import com.poll.DAO.VoteDaoImpl;
import com.poll.Model.Question;
import com.poll.Model.User;
import com.poll.Model.Vote;
import com.poll.service.VoteService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class VoteController {

	@Autowired
	VoteService service;
	
//	Controller for give the vote to the perticular poll by user
	
	@RequestMapping(path = "/vote", method = RequestMethod.GET)
	public String AddVote(Vote vote,Question setQuestion,
			HttpServletRequest req
			,Model model) {

		HttpSession session = req.getSession();
		
		User user = (User)session.getAttribute("user");
		String question=(String)session.getAttribute("question");
		String voteOption = (String) session.getAttribute("voteOption");
		int questionId = Integer.parseInt(question);
		setQuestion.setQuestionId(questionId);
		vote.setQuestion(setQuestion);
		vote.setVoteOption(voteOption);
		vote.setUser(user);

	
		int voted = service.insertVote(vote);

		if (voted!=0) {

			return "redirect:/showPoles?userEmail="+user.getEmail();
		}else{
			System.out.println("Something went to wrong");
			return "success";
		}
	
	}
	
//	To show the voted Users to admin
	
	@RequestMapping(path = "/showUser" , method = RequestMethod.GET)
	public String showVotedUsers(Model model) {
		List<Vote> allVote = service.getAllVote();
		model.addAttribute("votedUsers", allVote);
		return "showVotedUsers";
	}
	
//	To reject the vote of perticular question for perticular user
	
	@RequestMapping(path = "/deleteVote", method = RequestMethod.GET)
	public String deleteVote(@RequestParam("voteId")String votedId) {
		int voteId= Integer.parseInt(votedId);
		boolean deleted = service.isDeleted(voteId);
		if (deleted) {
			return "redirect:/showUser";
		}
		else {
			return "failed";
		}
		
	}
}
