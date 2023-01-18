package com.xworkz.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditDTO
{
	@Min(value = 10, message = "AName is Invalid should be more than 5 or less than 10")
	@Max(value = 80, message = "Id should be more than 10 or less than 80")
	private int id;
	@NotBlank
	@NotNull(message = "solider name connot be null")
	@Size(min = 5, max = 10, message = "Name is Invalid should be more than 5 or less than 10")
    private String name;
	private String rank;
	private String betallion;
	private String country;


}
