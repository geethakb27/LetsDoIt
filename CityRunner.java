package com.xworkz.maps.ex;


	import java.util.Collection;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Set;
	import java.util.Map.Entry;

	public class CityRunner {

		public static void main(String[] args) {

			Map<String, Double> map = new HashMap<String, Double>();
			map.put("Bangaluru", 32.1);
			map.put("Mangalore", 29.3);
			map.put("Mandya", 30.4);
			map.put("Hubli", 35.1);
			map.put("Mysore", 38.2);
			map.put("Tumkur", 28.7);
			map.put("Davanagere", 24.5);
			map.put("Chitradurga", 31.8);
			map.put("Bellary", 33.3);
			map.put("Bagalkot", 40.5);

			System.out.println(map.size());

			if (map.isEmpty()) {
				System.out.println("Yenu illa");
			} else {
				System.out.println("Yella ide");
			}

			System.out.println("==========Keys==========");
			Set<String> set = map.keySet();
			set.forEach(ref -> System.out.println(ref));

			System.out.println("=========Values=========");
			Collection<Double> values = map.values();
			values.forEach(ref -> System.out.println(ref));

			System.out.println("========Keys and values pairs=======");
			Set<Entry<String, Double>> entries = map.entrySet();

			for (Entry<String, Double> entry : entries) {
				System.out.println(entry.getKey() + " : " + entry.getValue());

			}
		}

	}


