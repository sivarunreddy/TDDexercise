package com.tdd.exercise;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzerTest {

	private FizzBuzzer fizzBuzzer;

	@Before
	public void setup() {
		fizzBuzzer = new FizzBuzzer();
	}
	
	@Test
	public void test_one_with_fizzbuzzer_should_return_one_as_string(){
		assertThat(fizzBuzzer.getFizzBuzzer(1),is(equalTo(new String[]{"1"})));
		
	}

}
