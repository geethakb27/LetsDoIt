package com.xworkz.king.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet(loadOnStartup = 2,urlPatterns ="/king")
	public class KingServlet extends HttpServlet

	{
		
		public KingServlet() 
		{
			System.out.println("created "+ this.getClass().getSimpleName());
		}
		
		@Override
		public void init() throws ServletException 
		{
			System.out.println("running init.. config..");
		}
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
		{
			System.out.println("running doGet in kingDom Servlet");
			String name = req.getParameter("KingName");
			String region = req.getParameter("region");
			String noOfQueens = req.getParameter("queens");
			String birth = req.getParameter("dateOfBirth");
			String death = req.getParameter("dateOfDeath");
			
			System.out.println(name);
			System.out.println(region);
			System.out.println(noOfQueens);
			System.out.println(birth);
			System.out.println(death);
			
			PrintWriter writer=resp.getWriter();
			writer.print("king name is "+ name +" sent successfully");
			resp.setContentType("text/plain");
		}

	}
