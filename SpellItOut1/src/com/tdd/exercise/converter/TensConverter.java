package com.tdd.exercise.converter;

public class TensConverter extends NumberToWordsConverter{

	public TensConverter(){
		divider=10;
		nextConverter=new UnitConverter();
	}

	@Override
	public String convert(Long number) {
		return getNumberName(number);
	}
	
	
}
