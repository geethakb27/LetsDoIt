

package com.xworkz.collections.dto;

import java.io.Serializable;

public class CalendarDTO implements Serializable {

	private String name;
	private int pageNo;
	private String company;

	public CalendarDTO() {
		super();
	}

	public CalendarDTO(String name, int pageNo, String company) {
		super();
		this.name = name;
		this.pageNo = pageNo;
		this.company = company;
	}
	
	@Override
	public boolean equals(Object ref) {
		System.out.println("running equals from calendarDTO");
		if(ref!=null) {
			if(ref instanceof CalendarDTO) {
				CalendarDTO dto =(CalendarDTO)ref;
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
		return "CalendarDTO [name=" + name + ", pageNo=" + pageNo + ", company=" + company + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
