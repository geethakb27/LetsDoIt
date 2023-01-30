package com.xworkz.multipage.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/amount")
public class StudentSecServlet extends HttpServlet {

	public StudentSecServlet() {
		System.out.println("Created..." + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in StudentSecServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in StudentSecServlet");
		String contactName = req.getParameter("contactName");
		String contactEmail = req.getParameter("contactEmail");
		String contactMobile = req.getParameter("contactMobile");
		String contactComments = req.getParameter("contactComments");

		System.out.println(contactName);
		System.out.println(contactEmail);
		System.out.println(contactMobile);
		System.out.println(contactComments);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (contactName.length() > 3 && contactEmail.length() > 3 && contactComments.length() > 3) {
			writer.print("<span style='color:green'>");
			writer.print("Sign up succesfully");
			writer.print("</span>");
		} else {
			writer.print("<span style='color:red'>");
			writer.print("Please provide valid information");
			writer.print("</span>");
		}
		writer.print("</h1>");
		writer.print("<a href=\"index.html\">Home page</a>");
		writer.print("<br>");
		writer.print("<a href=\"HomePage1.html\">Contact page</a>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
}
