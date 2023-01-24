package com.xworkz.hakuna_matata;


	import java.io.IOException;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	
	@WebServlet(loadOnStartup = 4,urlPatterns = "/group" )

	public class PeopleServlet  extends HttpServlet
	{

		public PeopleServlet() {
		     System.out.println("created..... people");
		}
		
		
		     
			@Override
			protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
			{
				System.out.println("running doGet in people");
			}
			
		}




