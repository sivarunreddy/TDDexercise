package com.tdd.exercise.converter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NumberConverterTest {
	@Test
	public void test_convert1AsOne() throws Exception {
		String one = new NumberConverter(new Double(1)).convertToWords();
		assertThat(one, is("One"));
	}
	
	

}
