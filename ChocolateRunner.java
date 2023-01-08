package com.xworkz.maps.ex;


	
	import java.util.Collection;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Set;

	public class ChocolateRunner {

		public static void main(String[] args) {

			Map<String, Double> map = new HashMap<String, Double>();
			map.put("DairyMilk", 300D);
			map.put("Fivestar", 5D);
			map.put("Gems", 20D);
			map.put("Ferrero rocher", 780D);
			map.put("Snickers", 15D);
			map.put("Harsheys", 200D);
			map.put("Kit kat", 10D);
			map.put("Dark Chocolate", 120D);
			map.put("Kisses", 150D);
			map.put("Bounty", 105D);

			System.out.println("==========Keys==========");
			Set<String> keys = map.keySet();
			keys.forEach(ref -> System.out.println(ref));

			System.out.println("=========Values=========");
			Collection<Double> values = map.values();
			values.forEach(ref -> System.out.println(ref));

			System.out.println("========Keys and values pairs=======");
			Set<Entry<String, Double>> entries = map.entrySet();
			for (Entry<String, Double> entry : entries) {
				System.out.println(entry.getKey() + " :" + entry.getValue());
			}
		}

	}



