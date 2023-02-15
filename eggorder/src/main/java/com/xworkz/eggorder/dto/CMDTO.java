package com.xworkz.eggorder.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CMDTO {
	
	@NotNull
	@Size(min=3, max= 20, message = "CM name shuold be more than 3 and less than 2")
	private String name;
	@NotBlank(message = "party cannot be null")
	private String party;
	@NotBlank(message = "state cannot be null")
	private String state;
	@NotNull(message = "party cannot be null")
	@Min(value= 1, message = "tenure cannot be less than zero")
	private String tenure;
	@NotBlank(message = "protfolio cannot be null")
	private String portfolio;

}
