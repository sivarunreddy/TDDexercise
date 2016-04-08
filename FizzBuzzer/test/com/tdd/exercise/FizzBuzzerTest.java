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

	@Test
	public void test_two_with_fizzbuzzer_should_return_one_to_two_string(){
		assertThat(fizzBuzzer.getFizzBuzzer(2),is(equalTo(new String[]{"1","2"})));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_zero_with_fizzbuzzer_should_throw_exception(){
		fizzBuzzer.getFizzBuzzer(0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_negative_value_with_fizzbuzzer_should_throw_exception(){
		fizzBuzzer.getFizzBuzzer(-1);
	}
	
	@Test
	public void test_three_with_fizzbuzzer_should_return_one_to_two_string_and_three_as_fizz(){
		assertThat(fizzBuzzer.getFizzBuzzer(3),is(equalTo(new String[]{"1","2","Fizz"})));
	}
	
	@Test
	public void test_five_with_fizzbuzzer_should_return_one_to_two_string_and_three_as_fizz_and_five_as_buzz(){
		assertThat(fizzBuzzer.getFizzBuzzer(5),is(equalTo(new String[]{"1","2","Fizz","4","Buzz"})));
	}
	
}
