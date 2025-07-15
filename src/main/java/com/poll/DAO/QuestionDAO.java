package com.poll.DAO;

import java.util.List;

import com.poll.Model.Question;

public interface QuestionDAO {
	
	
	public int addQuestion(Question question);
	public List<Question> getAllQuestion();
	public boolean deletePoll(int questionId);
	public void updatePoll(Question question);
	public Question getQuestionById(int questionId);
	
	
}
