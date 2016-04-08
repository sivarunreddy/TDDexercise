package com.tdd.exercise;

public class FizzBuzzer {

	public String[] getFizzBuzzer(int number) {
		String fizzBuzzerString[]=new String[number];
		for(int i=1;i<=number;i++){
			fizzBuzzerString[i-1]=Integer.toString(i);
		}
		return fizzBuzzerString;
	}

}
