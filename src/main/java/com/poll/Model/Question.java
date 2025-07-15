package com.poll.Model;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int QuestionId;
	private String 	questions;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private LocalDate date =LocalDate.now();
	
	@OneToMany(mappedBy = "question",fetch = FetchType.EAGER)
	
	List<Vote> votes;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	

	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public Question(String questions, String option1) {
		super();
		this.questions = questions;
		this.option1 = option1;
	}


	public Question(int questionId, String questions, String option1, List<Vote> votes) {
		super();
		QuestionId = questionId;
		this.questions = questions;
		this.option1 = option1;
		this.votes = votes;
	}

	public int getQuestionId() {
		return QuestionId;
	}

	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}
	
	
	
	public String getOption2() {
		return option2;
	}


	public void setOption2(String option2) {
		this.option2 = option2;
	}


	public String getOption3() {
		return option3;
	}


	public void setOption3(String option3) {
		this.option3 = option3;
	}


	public String getOption4() {
		return option4;
	}


	public void setOption4(String option4) {
		this.option4 = option4;
	}


	public List<Vote> getVotes() {
		return votes;
	}

	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return "Question [QuestionId=" + QuestionId + ", questions=" + questions + ", option1=" + option1 + ", option2="
				+ option2 + ", option3=" + option3 + ", option4=" + option4 + ", date=" + date + "]";
	}
	
	

}
