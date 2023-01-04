package com.xworkz.Sanitizer;

import java.io.Serializable;

public class PlaceDTO  implements Serializable {
	private String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private int VisitingFees;

	

	public PlaceDTO(String name, String location, String builtBy, boolean destroyed, int visitingFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		VisitingFees = visitingFees;
	}

	@Override
	public int hashCode() {
		return 29;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if (obj instanceof PlaceDTO) {
				{
					PlaceDTO dto=(PlaceDTO)obj;
					if (dto.getName().equals(this.name)&&dto.getLocation().equals(this.location)) {
						System.out.println(" Name and location is  cheacked           ");
						return true;
					}
				}
				
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "PalaceDto [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyed="
				+ destroyed + ", VisitingFees=" + VisitingFees + "]";
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public boolean getDestroyed() {
		return destroyed;
	}

	public int getVisitingFees() {
		return VisitingFees;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public void setVisitingFees(int visitingFees) {
		VisitingFees = visitingFees;
	}

}

