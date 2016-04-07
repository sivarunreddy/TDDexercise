package com.tdd.exercise.converter;

import com.tdd.exercise.exception.NagativeValuesNotSupported;
import com.tdd.exercise.exception.NumberRangeNotSupportedException;

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

	public String convertToWords() throws NumberRangeNotSupportedException, NagativeValuesNotSupported {
		Long wholeNumber = Math.round(number);
		if(number>99999){
			throw new NumberRangeNotSupportedException("Number rang not supported. Max number is - 99999");
		}
		
		if(wholeNumber<0){
			throw new NagativeValuesNotSupported();
		}
		NumberToWordsConverter converter=new ThousandsConverter();
		return converter.convert(wholeNumber);
		
	}

}
