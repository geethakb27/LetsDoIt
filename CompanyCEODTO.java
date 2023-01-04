package com.xworkz.Sanitizer;

import java.io.Serializable;

public class CompanyCEODTO  implements Serializable {

	private String names;
	private String company;
	private int ages;
	private String country;
	private String qualification;
	private boolean married;
	
	public CompanyCEODTO() {
		// TODO Auto-generated constructor stub
	}

	public CompanyCEODTO(String name, String company, int ages, String country, String qualification, boolean married) {
		super();
		this.names= name;
		this.company = company;
		this.ages = ages;
		this.country = country;
		this.qualification = qualification;
		this.married = married;
	}

	@Override
	public String toString() {
		return "CompanyCEODTO [name=" + names + ", company=" + company + ", age=" + ages + ", country=" + country
				+ ", qualification=" + qualification + ", married=" + married + ", daugtherDTO=]";
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof CompanyCEODTO) {
				CompanyCEODTO companyCEODTO = (CompanyCEODTO) obj;
				if (companyCEODTO.getNames().equals(this.names)) {

					System.out.println("Cheacking Sucessfully ");
					return true;
				}

			}
		}
		return false;
	}
	

	public String getNames() {
		return names;
	}

	public String getCompany() {
		return company;
	}

	public int getAges() {
		return ages;
	}

	public String getCountry() {
		return country;
	}

	public String getQualification() {
		return qualification;
	}

	public boolean isMarried() {
		return married;
	}

	

	public void setName(String name) {
		this.names = name;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setAge(int age) {
		this.ages = age;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	

}
