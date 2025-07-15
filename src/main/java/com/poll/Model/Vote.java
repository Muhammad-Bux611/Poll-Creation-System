package com.poll.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Vote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int voteId;
	private String voteOption;

	@ManyToOne
	private User user;
	
	@ManyToOne
	private Question question;


	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Vote(int voteId,User users, Question question) {
		super();
		this.voteId = voteId;
		this.user = users;
		this.question = question;
	}


	public String getVoteOption() {
		return voteOption;
	}


	public void setVoteOption(String voteOption) {
		this.voteOption = voteOption;
	}


	public int getVoteId() {
		return voteId;
	}


	public void setVoteId(int voteId) {
		this.voteId = voteId;
	}


//	public User getUser() {
//		return user;
//	}
//
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	
	

	public Question getQuestion() {
		return question;
	}


	public void setQuestion(Question question) {
		this.question = question;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Vote [voteId=" + voteId + ", voteOption=" + voteOption + ", user=" + user + ", question=" + question
				+ "]";
	}


}
