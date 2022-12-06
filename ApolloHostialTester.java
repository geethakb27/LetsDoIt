package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.Patient.Gender;
import com.xworkz.hospitalapp.Patient.Patient;

public class ApolloHostialTester
{

	public static void main(String[] args) {
		
		int n=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		ApolloHospital apolloHospital = new ApolloHospital(size);
		 
		for(int i=0;i<=size;i++)
			
		{
		
		Patient patient = new Patient();
		//while(n<size)
		{
		System.out.println("enter name");

		patient.patientName = sc.next();
		System.out.println("enter age");

		patient.age=sc.nextInt();
		System.out.println("enter addres");

		patient.addres=sc.next();
		System.out.println("enter gender ");
        
		
		patient.setGender(Gender.valueOf(sc.next()));
		String gender;
		String.gender=sc.next();
        Patient.gender=Gender.valueOf(gender);
		
		//apolloHospital.addPatient(patient);
		//n=n+1;
		}
		}
		//apolloHospital.getAllPatinet();
		apolloHospital.getAllPatient();
		
		System.out.println("enter the patient name");
		Scanner scanner;
		String patientName = scanner.next();
		ApolloHospital.getPatientbyAddress(patientName);
		
	}
}
