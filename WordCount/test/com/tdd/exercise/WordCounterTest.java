package com.tdd.exercise;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WordCounterTest {
	
	@Test
	public void test_empty_String() {
		assertTrue(new WordCounter("").getUniqueWordsCount().isEmpty());
	}
}
