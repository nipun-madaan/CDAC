package com.cdac.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {

	public List<Question> loadQuestionsOnJava() {
		QuestionBank qb = new QuestionBank();
		qb.addSubject("Java");
		
		Question q = new Question("What is Java");
		List<Option> ops = new ArrayList<Option>();
		ops.add(new Option("Java is a Database", false));
		ops.add(new Option("Java is an OS", false));
		ops.add(new Option("Java is a Programming Language", true));
		ops.add(new Option("Java is a Browser", false));
		q.setOptions(ops);
		qb.addQuestion("Java", q);
		
		q = new Question("What is JVM");
		ops = new ArrayList<Option>();
		ops.add(new Option("Java Virtual Machine", true));
		ops.add(new Option("Java Viral Machine", false));
		ops.add(new Option("Java Violent Machine", false));
		ops.add(new Option("Java Volatile Machine", false));
		q.setOptions(ops);
		qb.addQuestion("Java", q);
		
		q = new Question("What is GC");
		ops = new ArrayList<Option>();
		ops.add(new Option("Garbage Collator", false));
		ops.add(new Option("Garbage Collector", true));
		ops.add(new Option("Gargle Colgate", false));
		ops.add(new Option("Go Corona Go", false));
		q.setOptions(ops);
		qb.addQuestion("Java", q);

		q = new Question("What is JRE");
		ops = new ArrayList<Option>();
		ops.add(new Option("Java is a Database", false));
		ops.add(new Option("Java is an OS", false));
		ops.add(new Option("Java is a Programming Language", true));
		ops.add(new Option("Java is a Browser", false));
		q.setOptions(ops);
		qb.addQuestion("Java", q);

		q = new Question("What is JDK");
		ops = new ArrayList<Option>();
		ops.add(new Option("Java is a Database", false));
		ops.add(new Option("Java is an OS", false));
		ops.add(new Option("Java is a Programming Language", true));
		ops.add(new Option("Java is a Browser", false));
		q.setOptions(ops);
		qb.addQuestion("Java", q);

		return qb.fetchQuestions("Java");
	}
}
