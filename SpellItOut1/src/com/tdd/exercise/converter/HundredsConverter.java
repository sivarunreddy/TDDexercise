package com.tdd.exercise.converter;

public class HundredsConverter extends NumberToWordsConverter {
	public HundredsConverter() {
		divider = 100;
		nextConverter = new TensConverter();
	}

	@Override
	public String convert(Long number) {
		String numberName;
		if (isRightConverter(number)) {
			numberName = getNumberName(number / divider) + " "
					+ DENOMINATORS[0];
		} else {
			return nextConverter.convert(number % divider);
		}
		if (hasMoreDigits(number)) {
			numberName = numberName + " "
					+ nextConverter.convert(number % divider);
		}
		return numberName;
	}

}
