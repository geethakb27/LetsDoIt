package com.xworkz.collections.dto;

import java.io.Serializable;

public class PlaceDTO implements Serializable
{

		private String name;
		private String famousFor;
		private long pincode;

		public PlaceDTO() {
			super();
		}

		public PlaceDTO(String name, String famousFor, long pincode) {
			super();
			this.name = name;
			this.famousFor = famousFor;
			this.pincode = pincode;
		}
		@Override
		public boolean equals(Object ref) {
			System.out.println("running equals from placeDTO");
			if(ref!=null) {
				if(ref instanceof PlaceDTO) {
					PlaceDTO dto =(PlaceDTO)ref;
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
			return "Place [name=" + name + ", famousFor=" + famousFor + ", pincode=" + pincode + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getFamousFor() {
			return famousFor;
		}

		public void setFamousFor(String famousFor) {
			this.famousFor = famousFor;
		}

		public long getPincode() {
			return pincode;
		}

		public void setPincode(long pincode) {
			this.pincode = pincode;
		}



	}



