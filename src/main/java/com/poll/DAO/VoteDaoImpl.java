package com.poll.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.poll.Model.User;
import com.poll.Model.Vote;

@Repository
public class VoteDaoImpl implements VoteDAO {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	
//	Method to give the vote and save details to the database
	
	@Override
	@Transactional
	public int addVote(Vote vote) {
		// TODO Auto-generated method stub
		int addVote =(Integer) hibernateTemplate.save(vote);
		return addVote;
	}

//	Method to get all the votes which are voted by users
	
	@Override
	public List<Vote> allVotes() {
		// TODO Auto-generated method stub
		
		List<Vote> votes= hibernateTemplate.loadAll(Vote.class);
		
		return votes;
	}
	
//	Method to delete the vote by id
	
	@Override
	@Transactional
	public boolean deleteVote(int voteId) {
		// TODO Auto-generated method stub
		
		Vote vote = hibernateTemplate.get(Vote.class, voteId);
		if (vote!=null) {
			hibernateTemplate.delete(vote);
			return true;
		}else {
			return false;
		}
		
		
	}



	
	
}
