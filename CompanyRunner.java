package com.xworkz.maps.ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CompanyRunner {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("IBM", "PHP");
		map.put("Accenture", "IDE");
		map.put("TCS", "Eclipse");
		map.put("Wipro", "C");
		map.put("Infosys", "Visual studio");
		map.put("HCL", "C++");
		map.put("DXC", "Mysql");
		map.put("Hexaware", "Cloud");
		map.put("JP Morgan", "AWS");
		map.put("Morgan stanley", "PHP");

		System.out.println("==========Keys==========");
		Set<String> keys = map.keySet();
		keys.forEach(ref -> System.out.println(ref));

		System.out.println("=========Values=========");
		Collection<String> values = map.values();
		values.forEach(ref -> System.out.println(ref));

		System.out.println("========Keys and values pairs=======");
		Set<Entry<String, String>> entries = map.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " :" + entry.getValue());
		}
	}

}

