class Vessel
{
	static String vesselName;
	static int price;
	static String brand;
	
	static void setvesselName(String name)
	{
	vesselName=name;
	}
	static String getvesselName()
	{
	return vesselName;
	}
	static void setprice(int pri)
	{
	price=pri;
	}
	static int getprice()
	{
	return price;
	}
	static void setbrand(String bran)
	{
	brand=bran;
	}
	static String getbrand()
	{
	return brand;
	}
}