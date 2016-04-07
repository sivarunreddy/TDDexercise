package com.tdd.exercise.converter;

public class NumberConverter {
	private Double number;
	private static final String UNITS[]=new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	
	public NumberConverter(Double number) {
		this.number = number;
	}

	public String convertToWords() {
		return UNITS[number.intValue()]; 
	}

}
