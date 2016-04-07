package com.tdd.exercise.converter;

public class NumberConverter {
	private Double number;
	private static final String UNITS[]=new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	private static final String TEENS[]=new String[]{"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	public NumberConverter(Double number) {
		this.number = number;
	}

	public String convertToWords() {
		Long wholeNumber=number.longValue();
		if(number<10){
			return getUnitName(wholeNumber.intValue());
		}else{
			return getTeenName(wholeNumber.intValue());
		}
	}
	
	private String getUnitName(int number){
		return UNITS[number]; 
	}
	
	private String getTeenName(int number){
		return TEENS[number%10];
	}

}
