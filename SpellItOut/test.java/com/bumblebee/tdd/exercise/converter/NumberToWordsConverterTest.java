package com.bumblebee.tdd.exercise.converter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bumblebee.tdd.exercise.converter.NumberToWordsConverter;
import com.bumblebee.tdd.exercise.exception.NumberRangeNotSupportedException;

public class NumberToWordsConverterTest {

	private NumberToWordsConverter numberToWordsConverter=null;
	@Before
	public void Setup(){
		numberToWordsConverter=new NumberToWordsConverter();
	}
	
	@Test
	public void test_to_Convert_SignedNumberToWords() throws Exception {
		assertEquals("Two Thousand Five Hundred Twenty Three", numberToWordsConverter.convert(new Double(2523)));
		assertEquals("One Hundred Twenty Five", numberToWordsConverter.convert(new Double(125.23)));
		assertEquals("One Hundred Twenty Six", numberToWordsConverter.convert(new Double(125.65)));
	}
	
	@Test
	public void test_to_Convert_UnSignedNumberToWords() throws Exception {
		assertEquals("Minus Two Thousand Five Hundred Twenty Three", numberToWordsConverter.convert(new Double(-2523)));
		assertEquals("Minus One Hundred Twenty Five", numberToWordsConverter.convert(new Double(-125.23)));
		assertEquals("Minus One Hundred Twenty Six", numberToWordsConverter.convert(new Double(-125.65)));
	}
	
	@Test(expected=NumberRangeNotSupportedException.class)
	public void testConvertLargeNumberToText() throws Exception {
		numberToWordsConverter.convert(new Double(1000000));
	}
	
	@After
	public void tearDown(){
		numberToWordsConverter=null;
	}
	
	
}
