class VesselTester
{
	public static void main(String args[])
	{
	Vessel.setvesselName("pan");
	Vessel.setprice(250);
	Vessel.setbrand("preethi");

	System.out.println(Vessel.getvesselName());
	System.out.println(Vessel.getprice());
	System.out.println(Vessel.getbrand());
	}
}