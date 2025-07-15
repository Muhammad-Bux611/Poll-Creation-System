package com.poll.DAO;

import java.util.List;

import com.poll.Model.User;
import com.poll.Model.Vote;

public interface VoteDAO {
	
	public int addVote(Vote vote) ;
	public List<Vote> allVotes();
//	public List<User> showUserToVote();
	public boolean deleteVote(int voteId);
}
