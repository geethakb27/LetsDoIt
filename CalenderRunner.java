package com.xworkz.collections.dto;

	//package com.xwrokz.Collection;

	import java.util.ArrayList;
	import java.util.Collection;

	//import com.xwrokz.Collection.dto.CalendarDTO;

	public class CalenderRunner {

		public static void main(String[] args) 
		{
			
			CalendarDTO calendarDTO1 = new CalendarDTO ("wallCalendar", 12, "Groupon");
			CalendarDTO calendarDTO2 = new CalendarDTO ("deskCalendar", 12, "Influitive");
			CalendarDTO calendarDTO3 = new CalendarDTO ("tableCalendar", 12, "Spinfluence");
			CalendarDTO calendarDTO4 = new CalendarDTO ("googleCalendar", 12, "Omnilert");
			CalendarDTO calendarDTO5 = new CalendarDTO ("wallCalendar", 12, "Technologent");
			
			boolean equals =  calendarDTO1.equals( calendarDTO5);
			System.out.println(equals);
			
			Collection< CalendarDTO>  calendars = new ArrayList< CalendarDTO>();
			calendars.add( calendarDTO1);
			calendars.add( calendarDTO2);
			
			boolean contains = calendars.contains( calendarDTO5);
			System.out.println("contains "+contains);

		}

	}

