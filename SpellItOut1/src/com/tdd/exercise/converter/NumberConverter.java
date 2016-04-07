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
		NumberToWordsConverter converter=new HundredsConverter();
		return converter.convert(wholeNumber);
		
	}

}
