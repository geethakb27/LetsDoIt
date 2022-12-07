package com.xworkz;

import java.util.Scanner;

import com.xworkz.hasa.Manager;
import com.xworkz.hasa.Showroom;
import com.xworkz.hasa.constant.Gender;

public class ShowroomTester {

	public static void main(String[] args) {
		{

			
			Scanner s=new Scanner(System.in);
			int n=0;
			System.out.println("enter size");
			int size=s.nextInt();
			Showroom sw=new Showroom(size);
			
			while(n<size)
			{
				Manager man=new Manager();
				System.out.println("enter the manager name");
				man.setName(s.next());
				System.out.println("enter the  manager age");
				man.setAge(s.nextInt());
				System.out.println("enter the gender");
				man.setGender(Gender.valueOf(s.next()));
				System.out.println("enter the manager address");
				man.setAddress(s.next());
				System.out.println("enter the manager role");
				man.setRole(s.next());
		
				sw.added(man);
				n=n+1;
			}
			sw.getManager();
			
			System.out.println("enter manager name to search");
			sw.getManagerByName(s.next());
			
			System.out.println("enter manager age to search");
			sw.getManagerByAge(s.nextInt());
			
			System.out.println("enter manager address to search");
			sw.getManagerByAddress(s.next());
			
			System.out.println("enter manager gender to search");
			sw.getManagerByGender(Gender.valueOf(s.next()));
			
			System.out.println("enter manager gender to search manager name");
			sw.getManagerNamebyGender(Gender.valueOf(s.next()));
			
			System.out.println("enter manager name to search manager gender");
			sw.getGenderByManagerName(s.next());
			
			System.out.println("enter manager name and newaddress to update the address");
			//System.out.println(sw.updateAdressByName(s.next(), s.next()));
			if(sw.updateAdressByName(s.next(), s.next()))
			{
				System.out.println("updated the data or address");
			}
			else
			{
				System.out.println("unable to fetch the details");
			}
			System.out.println("enter manager to delete");
			sw.deleteByName(s.next());
			
			System.out.println("enetr manager age to delete");
			sw.deleteByAge(s.nextInt());
			sw.getnewManager();
			
			System.out.println("enter manager Gender to delete");
			sw.deleteByGender(Gender.valueOf(s.next()));
			sw.getManager();
			
		}

	}
}
