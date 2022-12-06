package com.xworkz.hospitalapp;

public class Hospital1 {

	String patinetNames[] = new String[10];
	int index;
	 
	public Hospital1()
	{
		//System.out.println("pateient detials");
	}
	public  boolean savePatinetNames(String patinetName)
	{
		System.out.println("inside patient names");
		
		if(patinetName != null)
			{
			patinetNames[index++] = patinetName;
			return true;
			}
		    System.out.println("end of patientNames : ");
		 return false;	
		 }
	
	  public void getPatinetNames()
	  {
		  for(int i=0;i<patinetNames.length;i++)
		  {
			  String ref =patinetNames[i];
			  System.out.println("patientNames is : " +ref);
			  
		  }
			  
	  }
	   public boolean  updatePatinetNames(String oldpatinetName, String newPatinetName)
	   
	   {
		   System.out.println("udpate patient names : ");
		   for(int i=0;i< patinetNames.length;i++)
		   {
			   if(patinetNames[i] == oldpatinetName)
			   {
				   patinetNames[i]= newPatinetName;
				   return true;
			   }
		   }
		   return false;
	  }
	   
}
