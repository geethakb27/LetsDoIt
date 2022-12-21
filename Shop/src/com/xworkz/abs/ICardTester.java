package com.xworkz.abs;

public class ICardTester
{
	public static void main(String[] args)
	{
	ICard c =new SbiBank();
			c.swip();
			ICard c1 = new HdfcBank();
			ICard c2 = new IcicBank();
			
		Bank bank = new SbiBank();
			
	}
}
