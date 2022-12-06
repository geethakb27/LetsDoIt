package com.xworkz.hospitalapp;

public class HospitalTester
{
 public static void main(String args[])
 {
	 Hospital1 hos = new Hospital1();
	 hos.savePatinetNames("Guna");
	 hos.savePatinetNames("Suma");
	 hos.savePatinetNames("priya");
	 hos.savePatinetNames("Ram4");
	 hos.savePatinetNames("Ram3");
	 hos.savePatinetNames("Ram2");
	 hos.savePatinetNames("Ram1");
	 hos.savePatinetNames("Abhi");
	 hos.savePatinetNames("parthi");
	 hos.getPatinetNames();
	 hos.updatePatinetNames("Guna","manu");
	 hos.getPatinetNames();
	 
 }
}
