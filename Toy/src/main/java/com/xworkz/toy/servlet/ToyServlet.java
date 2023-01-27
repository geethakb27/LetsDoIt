package com.xworkz.toy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3,urlPatterns ="/toy")

public class ToyServlet extends HttpServlet {

	public ToyServlet() 
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
		System.out.println("running doGet in ToyServlet");
		String name = req.getParameter("name");
		String type = req.getParameter("toytype");
		String price = req.getParameter("price");
		String color = req.getParameter("toycolor");
		String user = req.getParameter("user");
		String quantity = req.getParameter("quantity");
		String shape = req.getParameter("shape");
		String mood = req.getParameter("palymood");

		
		System.out.println(name);
		System.out.println(type);
		System.out.println(price);
		System.out.println(color);
		System.out.println(user);
		System.out.println(quantity);
		System.out.println(shape);
		System.out.println(mood);


		
		PrintWriter writer=resp.getWriter();
		writer.print("ToyServlet name is "+ name +" sent successfully");
		resp.setContentType("text/plain");
	}

}


