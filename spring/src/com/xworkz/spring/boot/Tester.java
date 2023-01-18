package com.xworkz.spring.boot;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args)
	{
		int my[] = new int[3];
		my[0]=78;
		my[1]=90;
		my[2]=98;
		//my[3]=95;
		System.out.println(Arrays.toString(my));
		
		int i=90;
		int y=0;
		try
		{
		System.out.println(i/y);
		System.out.println("something is fishy");
		
		String str = null;
		
		System.out.println(str.charAt(1));
		}
		//System.out.println("handle by expection");
		
  
		catch(ArithmeticException e)
		{
			System.out.println("cannot divied by zero");
		}

//		catch(NullPointerException np)
//		{
//			System.out.println("expection");
//		}
	   System.out.println("main method is ended ");

	}
}