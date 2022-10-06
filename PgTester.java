class PgTester
{
	public static void main(String args[])
	{
	Pg.setpgId(101);
	Pg.setpgName("kushi");
	Pg.setprice(5000);
	
	System.out.println(Pg.getpgId());
	System.out.println(Pg.getpgName());
	System.out.println(Pg.getprice());
	
	}
}