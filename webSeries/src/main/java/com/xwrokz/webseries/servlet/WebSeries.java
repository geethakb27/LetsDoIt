package com.xwrokz.webseries.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet(loadOnStartup = 2,urlPatterns ="/series")
	public class WebSeries extends HttpServlet

	{
		
		public WebSeries() 
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
			System.out.println("running doGet in WebSeries");
			String name = req.getParameter("name");
			String lang = req.getParameter("wblang");
			String noOfecpisode = req.getParameter("ecpisode");
			String ott = req.getParameter("ott");
			String budget = req.getParameter("budget");
			
			System.out.println(name);
			System.out.println(lang);
			System.out.println(noOfecpisode);
			System.out.println(ott);
			System.out.println(budget);
			
			PrintWriter writer=resp.getWriter();
			writer.print("WebSeries name is "+ name +" sent successfully");
			resp.setContentType("text/plain");
		}

	}
