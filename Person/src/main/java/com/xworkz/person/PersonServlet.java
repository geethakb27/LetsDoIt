package com.xworkz.person;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/details")
public class PersonServlet extends HttpServlet {

	public PersonServlet() {

		System.out.println("Created..." + this.getClass().getSimpleName());

	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in PersonServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in PersonServlet");
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String gender = req.getParameter("gender");
		String reason = req.getParameter("reason");
		String address = req.getParameter("address");

		System.out.println("firstName " +firstName);
		System.out.println("lastName " +lastName);
		System.out.println("gender " +gender);
		System.out.println("reason "+reason);
		System.out.println("address " +address);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("Display.jsp");
		
		req.setAttribute("firstName", firstName);
		req.setAttribute("lastName", lastName);
		req.setAttribute("gender", gender);
		req.setAttribute("reason", reason);
		req.setAttribute("address", address);
		dispatcher.forward(req, resp);
		
	}

}
