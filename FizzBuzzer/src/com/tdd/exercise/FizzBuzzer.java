package com.tdd.exercise;

public class FizzBuzzer {

	public String[] getFizzBuzzer(int number) {
		checkForIllegalArguments(number);
		String fizzBuzzerString[]=new String[number];
		for(int i=1;i<=number;i++){
			fizzBuzzerString[i-1]=getNumberAsString(i);
		}
		return fizzBuzzerString;
	}
	
	private void checkForIllegalArguments(int number){
		if(number<=0){
			throw new IllegalArgumentException();
		}
	}
	
	private String getNumberAsString(int number){
		String value=Integer.toString(number);
		
		if(number%3==0){
			value="Fizz";
		}
		
		if(number%5==0){
			value="Buzz";
		}
		return value;
	}

}
