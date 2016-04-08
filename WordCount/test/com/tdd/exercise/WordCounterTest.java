package com.tdd.exercise;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordCounterTest {
	
	@Test
	public void test_empty_String() {
		assertTrue(new WordCounter("").getUniqueWordsCount().isEmpty());
	}
	
	@Test
	public void test_one_word_string() {
		String text="TDD";
		Map<String,Integer> wordMap=new HashMap<>();
		wordMap.put("TDD", 1);
		assertThat(new WordCounter(text).getUniqueWordsCount(), is(equalTo(wordMap)));
	}
	
}
