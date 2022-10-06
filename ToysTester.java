package tech;

public class ToysTester {

	public static void main(String args[])
	{
		Toys.setName("doll");
		Toys.setColor("pink");
		Toys.setPrice(3000);
		System.out.println("==================================");
	System.out.println("Color is " +Toys.getColor());
	System.out.println("==================================");
	System.out.println("Name is " +Toys.getName());
	System.out.println("==================================");
	System.out.println("Price is " +Toys.getPrice());
	System.out.println("==================================");
	
	}
}
