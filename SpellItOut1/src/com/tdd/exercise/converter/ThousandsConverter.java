package com.tdd.exercise.converter;

public class ThousandsConverter extends NumberToWordsConverter{
	
	public ThousandsConverter(){
		divider=1000;
		nextConverter=new HundredsConverter();
	}
	
	@Override
	public String convert(Long number) {
		String numberName;
		if (isRightConverter(number)) {
			numberName = getNumberName(number / divider) + " "
					+ DENOMINATORS[1];
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
