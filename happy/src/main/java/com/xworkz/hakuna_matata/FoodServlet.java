package com.xworkz.hakuna_matata;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 3,urlPatterns = "/yumm" )

public class FoodServlet  extends HttpServlet
{

	public FoodServlet() {
	     System.out.println("created..... food");
	}
	
	
	     
		@Override
		protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
		{
			System.out.println("running doGet in food");
		}
		
	}

