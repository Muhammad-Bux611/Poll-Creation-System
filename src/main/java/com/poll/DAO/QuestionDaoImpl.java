package com.poll.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.poll.Model.Question;

@Repository
public class QuestionDaoImpl implements QuestionDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	
//	Method to add the Question with option in the database
	
	@Override
	@Transactional
	public int addQuestion(Question question) {
		// TODO Auto-generated method stub
		int added= (Integer)hibernateTemplate.save(question);
		
		return added;
	}

//	 Method to get all the Questions which are created
	
	@Override
	public List<Question> getAllQuestion() {
		// TODO Auto-generated method stub
		
		List<Question> questions= hibernateTemplate.loadAll(Question.class);
		return questions;
	}

//	Method to delete the Question by id
	
	@Override
	@Transactional
	public boolean deletePoll(int questionId) {
		// TODO Auto-generated method stub
		
		Question question = hibernateTemplate.get(Question.class,questionId);
		
		System.out.println(question);
		if (question!=null) {
			hibernateTemplate.delete(question);
			return true;
		}else {
		return false;
		}
	}

//	Method to update the Question
	
	@Override
	@Transactional
	public void updatePoll(Question question) {
		// TODO Auto-generated method stub
		
		hibernateTemplate.update(question);
		
	}

//	Method to get the question by id
	
	@Override
	public Question getQuestionById(int questionId) {
		// TODO Auto-generated method stub
		
		Question question = hibernateTemplate.get(Question.class , questionId);
		
		return question;
	}
	
}
