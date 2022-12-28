package com.xworkz.collections.dto;

import java.io.Serializable;

public class GameDTO implements Serializable
 {

		private String name;
		private String type;
		private int noOfPlayers;

		public GameDTO() {
			super();
		}

		public GameDTO(String name, String type, int noOfPlayers) {
			super();
			this.name = name;
			this.type = type;
			this.noOfPlayers = noOfPlayers;
		}
		@Override
		public boolean equals(Object ref) {
			System.out.println("running equals from gameDTO");
			if(ref!=null) {
				if(ref instanceof GameDTO) {
					GameDTO dto= (GameDTO)ref;
					if(dto.name.equals(this.name)) {
						System.out.println("name is matching "+dto.name);
						return true;
					}
				}
			}
			return false;
		}

		@Override
		public String toString() {
			return "GameDTO [name=" + name + ", type=" + type + ", noOfPlayers=" + noOfPlayers + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getNoOfPlayers() {
			return noOfPlayers;
		}

		public void setNoOfPlayers(int noOfPlayers) {
			this.noOfPlayers = noOfPlayers;
		}

		
	}

