package com.xworkz.maps.ex;



	import java.util.Collection;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Set;
	import java.util.Map.Entry;

	public class AreaRunner {

		public static void main(String[] args) {

			Map<Integer, String> map = new HashMap<Integer, String>();
			map.put(560021, "Gaythrinagar");
			map.put(560022, "Vijaynagar");
			map.put(560023, "Rajajinagar");
			map.put(560024, "Hebbal");
			map.put(560025, "Yeshwanthpur");
			map.put(560026, "Dasarahalli");
			map.put(560027, "Basaveshwarnagar");
			map.put(560028, "Sirampura");
			map.put(560029, "Kuvempu road");
			map.put(560030, "National college");

			System.out.println("==========Keys==========");
			Set<Integer> keys = map.keySet();
			keys.forEach(ref -> System.out.println(ref));

			System.out.println("=========Values=========");
			Collection<String> values = map.values();
			values.forEach(ref -> System.out.println(ref));

			System.out.println("========Keys and values pairs=======");
			Set<Entry<Integer, String>> entries = map.entrySet();
			for (Entry<Integer, String> entry : entries) {
				System.out.println(entry.getKey() + " :" + entry.getValue());
			}
		}

	}


