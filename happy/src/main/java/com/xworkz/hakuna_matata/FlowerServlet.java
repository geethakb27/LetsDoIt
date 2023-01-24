package com.xworkz.hakuna_matata;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 2,urlPatterns = "/happiness" )
public class FlowerServlet extends HttpServlet 
{
	public FlowerServlet()
	{
     System.out.println("created..... flower");
     }
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		System.out.println("running doGet in flower");
	}
	
}
