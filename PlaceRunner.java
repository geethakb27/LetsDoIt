package com.xworkz.collections.dto;

import java.util.ArrayList;
import java.util.Collection;

public class PlaceRunner
{

		public static void main(String[] args)
		{
			
			PlaceDTO placeDTO1 = new PlaceDTO("Shivamogga","touristPlace", 577201);
			PlaceDTO placeDTO2 = new PlaceDTO("Bhadravathi","Iron&SteelPlant", 577301);
			PlaceDTO placeDTO3 = new PlaceDTO("Bengaluru","SoftwareCompany", 560001);
			PlaceDTO placeDTO4 = new PlaceDTO("Mysuru","Dasara", 570001);
			PlaceDTO placeDTO5 = new PlaceDTO("Bellary","Hampi", 583102);
			
			boolean equals = placeDTO1.equals(placeDTO5);
			System.out.println( equals);
			
			Collection<PlaceDTO> places = new ArrayList<PlaceDTO>();
			places.add(placeDTO1);
			places.add(placeDTO2);
			
			boolean contains = places.contains(placeDTO5);
			System.out.println("contains"+contains);
			

		}

	}


