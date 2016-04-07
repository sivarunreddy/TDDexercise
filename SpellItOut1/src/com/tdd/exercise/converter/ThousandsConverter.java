package com.tdd.exercise.converter;

public class ThousandsConverter extends NumberToWordsConverter{
	
	public ThousandsConverter(){
		divider=100;
		nextConverter=new HundredsConverter();
	}

}
