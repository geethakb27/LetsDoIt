package com.xworkz.multipage.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/multipage")
public class StudentServlet extends HttpServlet {

	public StudentServlet() {

		System.out.println("Created..." + this.getClass().getSimpleName());

	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in StudentServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in StudentServlet");
		String studentName = req.getParameter("studentName");
		String studentEmail = req.getParameter("studentEmail");
		String studentStartPoint = req.getParameter("studentStartPoint");
		String studentEndPoint = req.getParameter("studentEndPoint");
		String studentGender = req.getParameter("studentGender");

		System.out.println(studentName);
		System.out.println(studentEmail);
		System.out.println(studentStartPoint);
		System.out.println(studentEndPoint);
		System.out.println(studentGender);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (studentName.length() > 3 && studentEmail.length() > 3 && studentStartPoint.length() > 3
				&& studentEndPoint.length() > 3) {
			writer.print("<span style='color:green'>");
			writer.print("Sign up succesfully");
			writer.print("</span>");
		} else {
			writer.print("<span style='color:red'>");
			writer.print("Please provide valid Company employee information");
			writer.print("</span>");
		}
		writer.print("</h1>");
		writer.print("<a href=\"index.html\">Home page</a>");
		writer.print("<br>");
		writer.print("<a href=\"homepage.html\">Location page</a>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}

}
