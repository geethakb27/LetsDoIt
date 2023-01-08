package com.xworkz.maps.ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PgRunner {

	public static void main(String[] args) {

		Map<String, Double> map = new HashMap<String, Double>();
		map.put("V R pg", 6000D);
		map.put("Diamond pg", 6400D);
		map.put("Kushi pg", 6800D);
		map.put("Manjunatha pg", 6200D);
		map.put("Sai pg", 7500D);
		map.put("S J R pg", 5000D);
		map.put("Veena Bhaskar pg", 4500D);
		map.put("S L R pg", 7000D);
		map.put("S M S pg", 6500D);
		map.put("M M S pg", 5500D);

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
