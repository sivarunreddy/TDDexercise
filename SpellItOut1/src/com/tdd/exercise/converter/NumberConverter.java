package com.tdd.exercise.converter;

public class NumberConverter {
	private Double number;
	private static final String UNITS[] = new String[] { "Zero", "One", "Two",
			"Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
	private static final String TEENS[] = new String[] { "Ten", "Eleven",
			"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
			"Seventeen", "Eighteen", "Nineteen" };
	private static final String TENS[] = new String[] { "Twenty", "Thirty",
			"Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

	public NumberConverter(Double number) {
		this.number = number;
	}

	public String convertToWords() {
		Long wholeNumber = number.longValue();
		if (number < 10) {
			return getUnitName(wholeNumber);
		} else if(number<20){
			return getTeenName(wholeNumber);
		}else 
			return getTenName(wholeNumber)+(wholeNumber%10==0?"":" "+getUnitName(wholeNumber%10));
		
	}

	private String getUnitName(Long number) {
		return UNITS[number.intValue()];
	}

	private String getTeenName(Long number) {
		return TEENS[number.intValue() % 10];
	}
	
	private String getTenName(Long number){
		return TENS[(number.intValue()/10)-2];
	}

}
