package com.tdd.exercise.converter;

public class HundredsConverter extends NumberToWordsConverter{
	public HundredsConverter(){
		divider=100;
		nextConverter=new TensConverter();
	}

	

}
