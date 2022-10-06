package tech;

public class EcommerceTester {
	public static void main(String args[])
	{
		Ecommerce.setApplicationName("Uber");
		Ecommerce.setCurrentLocation("saideep Pg to");
		Ecommerce.setDestinationAdress("yaswathpur railway station");
		Ecommerce.setPrice(150);
		System.out.println("==================================");
		System.out.println("ApplicationName "+Ecommerce.getApplicationName());
		System.out.println("==================================");
	   System.out.println("CurrentLocation "+Ecommerce.getCurrentLocation());
	   System.out.println("==================================");
	   System.out.println("DestinationAdress "+Ecommerce.getDestinationAdress());
	   System.out.println("==================================");
	  System.out.println("Price "+Ecommerce.getPrice());
	
	}
	

}
