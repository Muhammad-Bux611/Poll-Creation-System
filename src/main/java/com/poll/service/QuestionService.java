package com.poll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poll.DAO.QuestionDAO;
import com.poll.Model.Question;

@Service
public class QuestionService {
	@Autowired
	private QuestionDAO dao;
	
	public boolean isAdded(Question question) {
		
	List<Question> questions =showQuestions();
	if (questions!=null) {
		for (Question singleQuestion : questions) {
			if (singleQuestion.getQuestions().equals(question.getQuestions())) {
				return false;
			}
		}
	}
	int isAdded = dao.addQuestion(question);
	if (isAdded!=0) {
		return true;
	}else {
		return false;
	}
		}
	
	public List<Question> showQuestions(){
		List<Question> questions =dao.getAllQuestion();
		return questions;
	}
	
	
	public boolean isDeleted(int id) {
		boolean deletePoll = dao.deletePoll(id);
		if (deletePoll) {
			System.out.println("deleted..");
			return true;
		}else {
			System.out.println("not deleted..");
			return false;
		}
	}
	
	public Question getQuestion(int questionId) {
		Question questionById = dao.getQuestionById(questionId);
		return questionById;
	}
	
	
	public void update(Question question) {
		dao.updatePoll(question);
		
	}
}
