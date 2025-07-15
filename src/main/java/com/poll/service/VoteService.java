package com.poll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poll.DAO.VoteDAO;
import com.poll.Model.Vote;

@Service
public class VoteService {

	@Autowired
	VoteDAO dao;
	
	public int insertVote(Vote vote) {
		List<Vote> votes = dao.allVotes();
		if (votes!=null) {
			for (Vote vote2 : votes) {
				if (vote2.getUser().getUserId()==vote.getUser().getUserId() && vote2.getQuestion().getQuestionId()==vote.getQuestion().getQuestionId()) {
					return 0;
				}
			}
		}else {
			int saveVote = (Integer)dao.addVote(vote);
			return saveVote;
		}

		int saveVote = (Integer)dao.addVote(vote);
		return saveVote;
	}
	
	
	public List getAllVote() {
		List<Vote> allVotes = dao.allVotes();
		return allVotes;
	}
	
	public boolean isDeleted(int voteId) {
		boolean deleteVote = dao.deleteVote(voteId);
		return deleteVote;
	}
	
}
