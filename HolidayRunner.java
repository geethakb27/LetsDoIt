package com.xworkz.collections.dto;

import java.util.ArrayList;
import java.util.Collection;

public class HolidayRunner
{

	public static void main(String[] args)
	{

		HolidayDTO holidayDTO1= new HolidayDTO("Deepavali", "october", 24);
		HolidayDTO holidayDTO2= new HolidayDTO("Dussehra", "october", 5);
		HolidayDTO holidayDTO3= new HolidayDTO("Valentine'sDay", "feb", 14);
		HolidayDTO holidayDTO4= new HolidayDTO("Holi", "March", 18);
		HolidayDTO holidayDTO5= new HolidayDTO("Deepavali", "october", 25);

		boolean equals =  holidayDTO1.equals( holidayDTO5);
		System.out.println(equals);

		Collection< HolidayDTO>  holidays = new ArrayList< HolidayDTO>();
		holidays.add( holidayDTO1);
		holidays.add( holidayDTO2);

		boolean contains = holidays.contains( holidayDTO5);
		System.out.println("contains "+contains);


	}

}

