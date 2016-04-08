package com.tdd.exercise;

public class FizzBuzzer {

	public String[] getFizzBuzzer(int number) {
		checkForIllegalArguments(number);
		String fizzBuzzerString[]=new String[number];
		for(int i=1;i<=number;i++){
			String value=Integer.toString(i);
			if(i%3==0){
				value="Fizz";
			}
			fizzBuzzerString[i-1]=value;
		}
		return fizzBuzzerString;
	}
	
	private void checkForIllegalArguments(int number){
		if(number<=0){
			throw new IllegalArgumentException();
		}
	}

}
