package com.bumblebee.tdd.exercise.converter;

import com.bumblebee.tdd.exercise.exception.NumberRangeNotSupportedException;

public class NumberToWordsConverter {

	private StringBuilder sBuilder = null;
	private final int[] dividers = { 10, 100, 1000 };
	private final String MINUS_LABEL = "Minus";
	private final int MAX_DIGITS = 5;

	public String convert(final Double actualNumber)
			throws NumberRangeNotSupportedException {
		sBuilder = new StringBuilder();
		Long number = Math.round(actualNumber);

		if (actualNumber < 0) {
			sBuilder.append(MINUS_LABEL).append(" ");
			number = -number;
		}

		checkNumberRang(number);
		convertToNames(dividers.length - 1, number);

		return sBuilder.toString();
	}

	private void checkNumberRang(Long Number)
			throws NumberRangeNotSupportedException {
		if (MAX_DIGITS < Number.toString().length())
			throw new NumberRangeNotSupportedException(
					"Number range not supported. Max digits supported is -"
							+ MAX_DIGITS);

	}

	private void convertToNames(int index, Long number) {
		if (index == 0) {
			sBuilder.append(getNumberName(number.intValue()));

		} else {
			index=getDividerIndex(index,number);
			int divider = dividers[index];
			int value = (int) (number / divider);
			sBuilder.append(getNumberName(value)).append(" ")
					.append(NumberNames.denominators.values()[index])
					.append(getSeparator(divider, number));

			convertToNames(index - 1, number % divider);
		}

	}

	private String getNumberName(int number) {
		String numberName = "";
		if (number >= 20) {
			numberName = NumberNames.tens.values()[number / 10 - 1].toString()
					+ getSeparator(10, Long.valueOf(number));
		}

		if (number % 10 > 0) {
			numberName = numberName
					+ NumberNames.units.values()[number % 10].name();
		}
		return numberName;
	}

	private String getSeparator(int denaminator, Long number) {
		if (number % denaminator > 0) {
			return " ";
		}
		return "";
	}
	
	private int getDividerIndex(int index,Long number){
		int divider = dividers[index];
		while (index>=0) {
			if(number < divider){
				index--;
				divider = dividers[index];
			}else{
				break;
			}
			
		}
		return index;
	}

}
