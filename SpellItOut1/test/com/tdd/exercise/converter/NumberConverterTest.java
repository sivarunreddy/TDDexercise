package com.tdd.exercise.converter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.exercise.exception.NagativeValuesNotSupported;
import com.tdd.exercise.exception.NumberRangeNotSupportedException;

public class NumberConverterTest {
	
	@Test
	public void test_convert1AsOne() throws Exception {
		String numberName = new NumberConverter(new Double(1)).convertToWords();
		assertThat(numberName, is("One"));
	}

	@Test
	public void test_convert2AsTwo() throws Exception {
		String numberName = new NumberConverter(new Double(2)).convertToWords();
		assertThat(numberName, is("Two"));
	}

	@Test
	public void test_convert9AsNine() throws Exception {
		String numberName = new NumberConverter(new Double(9)).convertToWords();
		assertThat(numberName, is("Nine"));
	}

	@Test
	public void test_convert10AsTen() throws Exception {
		String numberName = new NumberConverter(new Double(10)).convertToWords();
		assertThat(numberName, is("Ten"));
	}

	@Test
	public void test_convert11AsElevan() throws Exception {
		String numberName = new NumberConverter(new Double(11)).convertToWords();
		assertThat(numberName, is("Eleven"));
	}

	@Test
	public void test_convert15AsFifteen() throws Exception {
		String numberName = new NumberConverter(new Double(15)).convertToWords();
		assertThat(numberName, is("Fifteen"));
	}

	@Test
	public void test_convert19AsNineteen() throws Exception {
		String numberName = new NumberConverter(new Double(19)).convertToWords();
		assertThat(numberName, is("Nineteen"));
	}

	@Test
	public void test_convert20AsTwenty() throws Exception {
		String numberName = new NumberConverter(new Double(20)).convertToWords();
		assertThat(numberName, is("Twenty"));
	}
	
	@Test
	public void test_convert21AsTwentyOne() throws Exception {
		String numberName = new NumberConverter(new Double(21)).convertToWords();
		assertThat(numberName, is("Twenty One"));
	}
	
	@Test
	public void test_convert29AsTwentyNine() throws Exception {
		String numberName = new NumberConverter(new Double(29)).convertToWords();
		assertThat(numberName, is("Twenty Nine"));
	}
	
	@Test
	public void test_convert30AsThirty() throws Exception {
		String numberName = new NumberConverter(new Double(30)).convertToWords();
		assertThat(numberName, is("Thirty"));
	}
	
	@Test
	public void test_convert50AsFifty() throws Exception {
		String numberName = new NumberConverter(new Double(50)).convertToWords();
		assertThat(numberName, is("Fifty"));
	}
	
	@Test
	public void test_convert99AsNinetyNine() throws Exception {
		String numberName = new NumberConverter(new Double(99)).convertToWords();
		assertThat(numberName, is("Ninety Nine"));
	}
	
	@Test
	public void test_convert100toWords() throws Exception {
		String numberName = new NumberConverter(new Double(100)).convertToWords();
		assertThat(numberName, is("One Hundred"));
	}
	
	@Test
	public void test_convert101toWords() throws Exception {
		String numberName = new NumberConverter(new Double(101)).convertToWords();
		assertThat(numberName, is("One Hundred One"));
	}
	
	@Test
	public void test_convert110toWords() throws Exception {
		String numberName = new NumberConverter(new Double(110)).convertToWords();
		assertThat(numberName, is("One Hundred Ten"));
	}
	
	@Test
	public void test_convert111toWords() throws Exception {
		String numberName = new NumberConverter(new Double(111)).convertToWords();
		assertThat(numberName, is("One Hundred Eleven"));
	}
	
	@Test
	public void test_convert120toWords() throws Exception {
		String numberName = new NumberConverter(new Double(120)).convertToWords();
		assertThat(numberName, is("One Hundred Twenty"));
	}
	
	@Test
	public void test_convert121toWords() throws Exception {
		String numberName = new NumberConverter(new Double(121)).convertToWords();
		assertThat(numberName, is("One Hundred Twenty One"));
	}
	
	@Test
	public void test_convert200toWords() throws Exception {
		String numberName = new NumberConverter(new Double(200)).convertToWords();
		assertThat(numberName, is("Two Hundred"));
	}
	

	@Test
	public void test_convert201toWords() throws Exception {
		String numberName = new NumberConverter(new Double(201)).convertToWords();
		assertThat(numberName, is("Two Hundred One"));
	}
	

	@Test
	public void test_convert500toWords() throws Exception {
		String numberName = new NumberConverter(new Double(500)).convertToWords();
		assertThat(numberName, is("Five Hundred"));
	}
	
	@Test
	public void test_convert999toWords() throws Exception {
		String numberName = new NumberConverter(new Double(999)).convertToWords();
		assertThat(numberName, is("Nine Hundred Ninety Nine"));
	}
	
	@Test
	public void test_convert1000toWords() throws Exception {
		String numberName = new NumberConverter(new Double(1000)).convertToWords();
		assertThat(numberName, is("One Thousand"));
	}
	
	@Test
	public void test_convert1001toWords() throws Exception {
		String numberName = new NumberConverter(new Double(1001)).convertToWords();
		assertThat(numberName, is("One Thousand One"));
	}
	
	@Test
	public void test_convert1010toWords() throws Exception {
		String numberName = new NumberConverter(new Double(1010)).convertToWords();
		assertThat(numberName, is("One Thousand Ten"));
	}
	
	@Test
	public void test_convert1011toWords() throws Exception {
		String numberName = new NumberConverter(new Double(1011)).convertToWords();
		assertThat(numberName, is("One Thousand Eleven"));
	}
	
	@Test
	public void test_convert1020toWords() throws Exception {
		String numberName = new NumberConverter(new Double(1020)).convertToWords();
		assertThat(numberName, is("One Thousand Twenty"));
	}
	
	@Test
	public void test_convert1099toWords() throws Exception {
		String numberName = new NumberConverter(new Double(1099)).convertToWords();
		assertThat(numberName, is("One Thousand Ninety Nine"));
	}
	
	@Test
	public void test_convert1100toWords() throws Exception {
		String numberName = new NumberConverter(new Double(1100)).convertToWords();
		assertThat(numberName, is("One Thousand One Hundred"));
	}
	
	@Test
	public void test_convert1999toWords() throws Exception {
		String numberName = new NumberConverter(new Double(1999)).convertToWords();
		assertThat(numberName, is("One Thousand Nine Hundred Ninety Nine"));
	}
	
	@Test
	public void test_convert10000toWords() throws Exception {
		String numberName = new NumberConverter(new Double(10000)).convertToWords();
		assertThat(numberName, is("Ten Thousand"));
	}
	
	@Test
	public void test_convert10001toWords() throws Exception {
		String numberName = new NumberConverter(new Double(10001)).convertToWords();
		assertThat(numberName, is("Ten Thousand One"));
	}
	
	@Test
	public void test_convert10100toWords() throws Exception {
		String numberName = new NumberConverter(new Double(10100)).convertToWords();
		assertThat(numberName, is("Ten Thousand One Hundred"));
	}
	
	@Test
	public void test_convert11000toWords() throws Exception {
		String numberName = new NumberConverter(new Double(11000)).convertToWords();
		assertThat(numberName, is("Eleven Thousand"));
	}
	
	@Test
	public void test_convert99999toWords() throws Exception {
		String numberName = new NumberConverter(new Double(99999)).convertToWords();
		assertThat(numberName, is("Ninety Nine Thousand Nine Hundred Ninety Nine"));
	}
	
	@Test(expected=NumberRangeNotSupportedException.class)
	public void test_Exception_for_above_99999_value() throws Exception {
		new NumberConverter(new Double(100000)).convertToWords();
	}
	
	@Test
	public void test_Convert_without_round_the_value() throws Exception {
		String numberName = new NumberConverter(new Double(10.25)).convertToWords();
		assertThat(numberName, is("Ten"));
	}
	
	@Test
	public void test_Convert_with_round_the_value() throws Exception {
		String numberName = new NumberConverter(new Double(10.65)).convertToWords();
		assertThat(numberName, is("Eleven"));
	}
	
	@Test(expected=NagativeValuesNotSupported.class)
	public void test_Exception_for_nagative_value() throws Exception {
		new NumberConverter(new Double(-10)).convertToWords();
	}
}
