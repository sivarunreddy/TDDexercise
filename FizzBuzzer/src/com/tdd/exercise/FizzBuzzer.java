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
		StringBuilder sBuilder=new StringBuilder();
		if(number%3==0){
			sBuilder.append("Fizz");
		}
		
		if(number%5==0){
			sBuilder.append("Buzz");
		}
		
		return sBuilder.length()>0?sBuilder.toString():Integer.toString(number);
	}

}
