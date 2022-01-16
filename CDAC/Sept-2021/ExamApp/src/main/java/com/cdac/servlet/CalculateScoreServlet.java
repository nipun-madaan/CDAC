package com.cdac.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.model.Option;
import com.cdac.model.Question;

/**
 * Servlet implementation class CalculateScoreServlet
 */
@WebServlet("/CalculateScoreServlet")
public class CalculateScoreServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int op = Integer.parseInt(request.getParameter("op"));
		
		HttpSession session = request.getSession();
		Question q = (Question) session.getAttribute("currentQs");

		List<Option> ops = q.getOptions();
		Option option = ops.get(op);
		Integer score = (Integer) session.getAttribute("score");
		if(score == null)
			score = 0;
		if(option.isRightAnswer()) {
			score ++;
		}
		session.setAttribute("score", score);
		response.sendRedirect("QuestionLoaderServlet");
	}

}
