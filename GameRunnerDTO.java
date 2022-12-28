package com.xworkz.collections.dto;

import java.util.ArrayList;
import java.util.Collection;

public class GameRunnerDTO {



	public static void main(String[] args) {
		
		GameDTO gameDTO1 = new GameDTO("Kabadi","Indoor",7);
		GameDTO gameDTO2 = new GameDTO("KuntePille","Indoor",5);
		GameDTO gameDTO3 = new GameDTO("Cricket","Outdoor",11);
		GameDTO gameDTO4 = new GameDTO("ludo","Indoor",4);
		GameDTO gameDTO5 = new GameDTO("Kabadi","Outdoor",7);
		
		boolean equals = gameDTO1.equals(gameDTO5);
		System.out.println(equals);
		
		Collection<GameDTO> games = new ArrayList<GameDTO>();
		games.add(gameDTO1);
		games.add(gameDTO2);
		
		boolean contains = games.contains(gameDTO5);
		System.out.println("contains "+contains);

	}

}


