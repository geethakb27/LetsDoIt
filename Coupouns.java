package com.xworkz.collections;

import java.util.Collection;
import java.util.TreeSet;

public class Coupouns {
	
	
		public static void main(String[] args) {
			String coupoun1="Discount Coupon Lady";
			String coupoun2="Ways to Earn";
			String coupoun3="Awesome Offers";
			String coupoun4="Ice Coupon Book";
			String coupoun5="Coats Discounts";
			String coupoun6="RedCoupon";
			String coupoun7="Queen Bee Coupons";
			String coupoun8="Everyday Saver";
			String coupoun9="MingCoupon";
			String coupoun10="Coupon Buddy";
			String coupoun11="Mystery Deal";
			String coupoun12="RetailCurve";
			
			Collection<String>collection=new TreeSet();
			collection.add(coupoun1);
			collection.add(coupoun2);
			collection.add(coupoun3);
			collection.add(coupoun4);
			collection.add(coupoun5);
			collection.add(coupoun6);
			collection.add(coupoun7);
			collection.add(coupoun8);
			collection.add(coupoun9);
			collection.add(coupoun10);
			collection.add(coupoun11);
			collection.add(coupoun12);
			System.out.println(collection.size());
			collection.clear();
			System.out.println("after clear...");
			System.out.println(collection.size());
			
		}
	}



