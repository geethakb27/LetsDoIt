package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
public class ValentineDTO {

	@Size(min = 3, max = 20, message = "name is  cannont greater than 20 and less than 3")
	private String name;
	@Size(min = 3, max = 20, message = "valetineName is  cannont greater than 20 and less than 3")
	private String valentineName;
	@NotBlank(message = " place should be selected")
	private String places;
	@NotBlank(message = " gift should be selected")
	private String gifts;

}
