package tech;

public class FurnitureTester {
	public static void main(String args[])
	{
		Furniture.setName("Kartell");
		Furniture.setColor("black");
		Furniture.setPrice(30000);
		System.out.println("==================================");
		System.out.println("Name is " +Furniture.getName());
		System.out.println("==================================");
	   System.out.println("Color is " +Furniture.getColor());
	   System.out.println("==================================");
	
	  System.out.println("Price is " +Furniture.getPrice());
	
	}
	

}
