package com.cdac.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank {

	private Map<String, List<Question>> questionBank;
	
	/* If we wouldn't have used a Map in this example, the approach could have been this:
	private List<Question> questionBankForJava;
	private List<Question> questionBankForPython;
	private List<Question> questionBankForHTML;*/
	
	public QuestionBank() {
		questionBank = new HashMap<String, List<Question>>();
	}
	
	public void addSubject(String subject) {
		questionBank.put(subject, new ArrayList<Question>());
	}
	
	public void addQuestion(String subject, Question question) {
		List<Question> questions = questionBank.get(subject);
		questions.add(question);
	}
	
	public List<Question> fetchQuestions(String subject) {
		List<Question> questions = questionBank.get(subject);
		return questions;
	}
	
}
