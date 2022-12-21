package com.xworkz.collections;

import java.util.Collection;
import java.util.LinkedList;

public class Currencies {

	public static void main(String[] args) {
		String currency1="Indian Rupees";
		String currency2="afghani";
		String currency3="lek";
		String currency4="dream";
		String currency5="kwanza";
		String currency6="guilder";
		String currency7="argentine peso";
		String currency8="taka";
		String currency9="kuna";
		String currency10="arabic dirham";
		String currency11="quetzel";
		String currency12="dalasi";
		String currency13="ghana sedi";
		String currency14="faroese karona";
		String currency15="birr";
		String currency16="nakfa";
		String currency17="algerian dinar";
		String currency18="czech krone";
		String currency19="colon";
		String currency20="cuban peso";
		String currency21="cook dollar";
		String currency22="pula";
		String currency23="manat";
		String currency24="boliviano";
		String currency25="bahamian dollar";
		String currency26="swiss franc";
		
		Collection<String>collection=new LinkedList();
		collection.add(currency1);
		collection.add(currency2);
		collection.add(currency3);
		collection.add(currency4);
		collection.add(currency5);
		collection.add(currency6);
		collection.add(currency7);
		collection.add(currency8);
		collection.add(currency9);
		collection.add(currency10);
		collection.add(currency11);
		collection.add(currency12);
		collection.add(currency13);
		collection.add(currency14);
		collection.add(currency15);
		collection.add(currency16);
		collection.add(currency17);
		collection.add(currency18);
		collection.add(currency19);
		collection.add(currency20);
		collection.add(currency21);
		collection.add(currency22);
		collection.add(currency23);
		collection.add(currency24);
		collection.add(currency25);
		collection.add(currency26);
		System.out.println(collection.size());
		System.out.println("after clear...");
		collection.clear();
		System.out.println(collection.size());
	}



}
