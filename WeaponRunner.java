package com.xworkz.collections.dto;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class WeaponRunner {

	public static void main(String[] args)
	{

		Collection<WeaponDTO> weaponDTOs = new LinkedList<WeaponDTO>();
		weaponDTOs.add(
				new WeaponDTO("Antiaircraft gun", "Neeraj", LocalDate.of(2022, 01, 01), 100D, WeaponType.ARTILLERY));
		weaponDTOs.add(new WeaponDTO("Anthrax", "Arun", LocalDate.of(2020, 05, 13), 2010D, WeaponType.BILOGICAL));
		weaponDTOs.add(new WeaponDTO("Ak47", "Darshan", LocalDate.of(1998, 11, 14), 21000D, WeaponType.BOMBS));
		weaponDTOs.add(new WeaponDTO("M416", "Sudeep", LocalDate.of(1890, 01, 13), 2000D, WeaponType.MISSILES));
		weaponDTOs.add(new WeaponDTO("Grossa", "Yash", LocalDate.of(1942, 02, 14), 18000D, WeaponType.ARTILLERY));
		weaponDTOs.add(new WeaponDTO("M4A16", "Omkar", LocalDate.of(1997, 03, 15), 1700D, WeaponType.NUCLEAR));
		weaponDTOs.add(new WeaponDTO("AWM", "Srisham", LocalDate.of(1998, 07, 16), 160D, WeaponType.BILOGICAL));
		weaponDTOs.add(new WeaponDTO("Kar98", "Anusha", LocalDate.of(1780, 02, 20), 1500D, WeaponType.ARTILLERY));
		weaponDTOs.add(new WeaponDTO("Cannon", "Nayana", LocalDate.of(1942, 04, 27), 1400D, WeaponType.BOMBS));
		weaponDTOs.add(new WeaponDTO("UMP", "Vinay", LocalDate.of(1893, 03, 30), 1300D, WeaponType.ARTILLERY));
		weaponDTOs.add(new WeaponDTO("Grenade", "Vivek", LocalDate.of(2001, 04, 29), 1100D, WeaponType.CHEMICAL));
		weaponDTOs.add(new WeaponDTO("Smoke", "Akhil", LocalDate.of(2002, 10, 18), 1000D, WeaponType.BILOGICAL));
		weaponDTOs.add(new WeaponDTO("Air gun", "Vijay", LocalDate.of(1989, 11, 19), 1200D, WeaponType.ARTILLERY));
		weaponDTOs.add(new WeaponDTO("Anthrax", "Ravi", LocalDate.of(1990, 07, 20), 120D, WeaponType.BOMBS));
		weaponDTOs.add(new WeaponDTO("German 88", "Spoorthy", LocalDate.of(1991, 06, 23), 100D, WeaponType.NUCLEAR));
		weaponDTOs.add(new WeaponDTO("Greek fire", "Likitha", LocalDate.of(1992, 05, 24), 600D, WeaponType.ARTILLERY));
		weaponDTOs.add(new WeaponDTO("Dirty bomb", "Navya", LocalDate.of(1994, 04, 25), 500D, WeaponType.CHEMICAL));
		weaponDTOs.add(new WeaponDTO("Pistool", "Vinoda", LocalDate.of(2004, 01, 30), 400D, WeaponType.BOMBS));
		weaponDTOs.add(new WeaponDTO("Paris Gun", "Sharath", LocalDate.of(2005, 02, 21), 300D, WeaponType.ARTILLERY));
		weaponDTOs.add(
				new WeaponDTO("Maxim machine gun", "Sanjay", LocalDate.of(2009, 01, 11), 200D, WeaponType.BILOGICAL));

		System.out.println("Printing price is greater than");
		weaponDTOs.stream().filter(dto -> dto.getPrice() > 1000).collect(Collectors.toList())
				.forEach(dto -> System.out.println(dto.getName()));

		System.out.println(System.lineSeparator());
		System.out.println("Printing all made by and made on");
		weaponDTOs.stream()
				.forEach(dto -> System.out.println("Weapon madeby " + dto.getMadeBy() + "made on " + dto.getMadeOn()));

		System.out.println(System.lineSeparator());
		System.out.println("Printing all weapon by desce order");
		weaponDTOs.stream().sorted((a1, a2) -> a2.getName().compareTo(a1.getName()))
				.forEach(dto -> System.out.println(dto.getName()));

		System.out.println(System.lineSeparator());
		System.out.println("Printing all weapon madeBy by asce order");
		weaponDTOs.stream().sorted((a1, a2) -> a1.getMadeBy().compareTo(a2.getMadeBy()))
				.forEach(dto -> System.out.println(dto.getMadeBy()));

		System.out.println(System.lineSeparator());
		System.out.println("Printing all weapon madeOn by asce order");
		weaponDTOs.stream().sorted((a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn()))
				.forEach(dto -> System.out.println(dto.getMadeOn()));

		System.out.println(System.lineSeparator());
		System.out.println("Printing all weapon price by asce order");
		weaponDTOs.stream().sorted((a1, a2) -> a1.getPrice().compareTo(a2.getPrice()))
				.forEach(dto -> System.out.println(dto.getPrice()));

		System.out.println(System.lineSeparator());
		System.out.println("Printing all weapon price by desce order");
		weaponDTOs.stream().sorted((a1, a2) -> a2.getPrice().compareTo(a1.getPrice()))
				.forEach(dto -> System.out.println(dto.getPrice()));

		System.out.println(System.lineSeparator());
		System.out.println("Printing all weapon name and madeOn by asc order");
		weaponDTOs.stream().sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
				.sorted((a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(dto -> System.out
						.println(" Sorted name " + dto.getName() + " Sorted madeOn " + dto.getMadeOn()));

		System.out.println(System.lineSeparator());
		System.out.println("Printing all weapon type, madeBy, name in desce order");
		weaponDTOs.stream().sorted((a1, a2) -> a1.getType().compareTo(a1.getType()))
				.sorted((a1, a2) -> a2.getMadeBy().compareTo(a1.getMadeBy()))
				.sorted((a1, a2) -> a2.getName().compareTo(a1.getName()))
				.forEach(dto -> System.out.println(" Sorted Type " + dto.getType() + " Sorted madeBy " + dto.getMadeBy()
						+ " Name is " + dto.getName()));

	}

}
