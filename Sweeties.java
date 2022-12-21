package com.xworkz.collections;

import java.util.Collection;
import java.util.TreeSet;

public class Sweeties 
 {
		public static void main(String[] args) {
			String sweet1="jamoon";
			String sweet2="peda";
			String sweet3="laddu";
			String sweet4="mysore pak";
			String sweet5="rasmalai";
			String sweet6="payasa";
			String sweet7="halwa";
			String sweet8="kulfi";
			String sweet9="halva";
			String sweet10="sona papadi";
			String sweet11="rasgulla";
			String sweet12="ghevar";
			String sweet13="malpua";
			
			Collection<String>collection=new TreeSet();
			collection.add(sweet1);
			collection.add(sweet2);
			collection.add(sweet3);
			collection.add(sweet4);
			collection.add(sweet5);
			collection.add(sweet6);
			collection.add(sweet7);
			collection.add(sweet8);
			collection.add(sweet9);
			collection.add(sweet10);
			collection.add(sweet11);
			collection.add(sweet12);
			collection.add(sweet13);//explicit
			collection.add("kova");//implicit
			System.out.println(collection.size());
			collection.clear();
			System.out.println("after clearing collections.....");
			System.out.println(collection.size());
			
		}
	}


