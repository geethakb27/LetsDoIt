package tech;

public class GalaxyTester {
	public static void main(String args[])
	{
		Galaxy.setName("milkwayGalaxy");
		Galaxy.setColor("black");
		Galaxy.setShape("Ovail");
		System.out.println("==================================");
		System.out.println("Name is " +Galaxy.getName());
		System.out.println("==================================");
	   System.out.println("Color is " +Galaxy.getColor());
	   System.out.println("==================================");
	
	  System.out.println("Shape is " +Galaxy.getShape());
	  System.out.println("==================================");
	
	}

}
