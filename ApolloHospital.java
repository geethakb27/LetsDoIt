package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.Patient.Gender;
import com.xworkz.hospitalapp.Patient.Patient;

public class ApolloHospital extends Hospital1 
{
	
	public static Patient [] patients;
	
	public ApolloHospital(int size)
	{
		patients= new Patient[size];                          //getPatientByAge(int age)
		                              
		
	}

	public boolean addPatient(Patient patient)
	{
		boolean isPatientAdded=false;
		
		//boolean isPatientAdded1 = false;
		if(patient!=null)
		{
			System.out.println("patient details");
			patients[index] = patient;
			
			isPatientAdded = true;
			 index++;
			 
		}
		return isPatientAdded;
	}

	public void getAllPatient()
	{
		System.out.println("list of patient");
		
		for(int i=0; i< patients.length;i++)
		{
			System.out.println(patients[i].addres+ "\n "+
		patients[i].age + " \n"+
			patients[i].patientName);
		}
		
	}
	
	public void getPatientbyAge(int patientAge) {

		System.out.println("Inside getpatientbyAge");

		for (int i = 0; i < patients.length; i++)
		{
			if (patients[i].getAge() == patientAge) {
				System.out.println(patients[i].getAge() + " " + patients[i].getAge() + " " + patients[i].getGender()
						+ " " + patients[i].getAddres());

			}
		}

		}
		public void getPatientbyGender(Gender patientGender) {
			  
			  System.out.println("Inside getPatientByGender"); for (int i = 0; i <
			  patients.length; i++) { if (patients[i].getGender().equals(patientGender)) {
			  System.out.println(patients[i].getAge() + " " + patients[i].getAge() + " " +
			  patients[i].getGender() + " " + patients[i].getAddres()); } }
			  
			  }
			  
		 public static void getPatientbyAddress(String patientAddress) {
			  
			  System.out.println("Inside getPatientByAddressr"); for (int i = 0; i <
			  patients.length; i++) { if (patients[i].getAddres().equals(patientAddress))
			  { System.out.println(patients[i].getAge() + " " + patients[i].getAge() + " "
			  + patients[i].getGender() + " " + patients[i].getAddres()); } }
			  
			  }
			  
		 public void getPatientNameByGender(Gender patientGender) {

				System.out.println("Inside getPatientNameByGender");
				for (int i = 0; i < patients.length; i++) {
					if (patients[i].getGender().equals(patientGender)) {
						System.out.println(patients[i].getAge());
					}
				}

			}
		 
		
			public void getPatientGenderByName(String patientName) {

				System.out.println("Inside getPatientGenderByName");
				for (int i = 0; i < patients.length; i++) {
					if (patients[i].getGender().equals(patientName)) {
						System.out.println(patients[i].getGender());
					}
				}
			}
}
