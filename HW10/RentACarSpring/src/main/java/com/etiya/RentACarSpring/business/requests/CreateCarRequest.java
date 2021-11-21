package com.etiya.RentACarSpring.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {
   
	private int colorId;
	private int brandId;
	private int modelYear;
	private double dailyPrice;
	private String description;
}
