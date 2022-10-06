package tech;

public class RailwayStationTester {
	public static void main(String args[])
	{
		RailwayStation.setStationName("Ksr railwaystation");
		RailwayStation.setAddress("majestic ");
		RailwayStation.setTickatCounter("1 counter");
		System.out.println("==================================");
		System.out.println("StationName is " +RailwayStation.getStationName());
		System.out.println("==================================");
	   System.out.println("Address is " +RailwayStation.getAddress());
	   System.out.println("==================================");
	
	  System.out.println("TickatCounter is " +RailwayStation.getTickatCounter());
	  System.out.println("==================================");
	}

}
