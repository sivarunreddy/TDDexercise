package com.tdd.exercise.converter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NumberConverterTest {
	@Test
	public void test_convert1AsOne() throws Exception {
		String digit = new NumberConverter(new Double(1)).convertToWords();
		assertThat(digit, is("One"));
	}
	
	@Test
	public void test_convert2AsTwo() throws Exception {
		String digit = new NumberConverter(new Double(2)).convertToWords();
		assertThat(digit, is("Two"));
	}
	
	@Test
	public void test_convert9AsNine() throws Exception {
		String digit = new NumberConverter(new Double(9)).convertToWords();
		assertThat(digit, is("Nine"));
	}
	
	@Test
	public void test_convert10AsTen() throws Exception {
		String digit = new NumberConverter(new Double(10)).convertToWords();
		assertThat(digit, is("Ten"));
	}
	
	@Test
	public void test_convert11AsElevan() throws Exception {
		String digit = new NumberConverter(new Double(11)).convertToWords();
		assertThat(digit, is("Eleven"));
	}
	
	@Test
	public void test_convert15AsFifteen() throws Exception {
		String digit = new NumberConverter(new Double(15)).convertToWords();
		assertThat(digit, is("Fifteen"));
	}
	
	@Test
	public void test_convert19AsNineteen() throws Exception {
		String digit = new NumberConverter(new Double(19)).convertToWords();
		assertThat(digit, is("Nineteen"));
	}

}
