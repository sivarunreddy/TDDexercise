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
		wordMap.put("tdd", 1);
		assertThat(new WordCounter(text).getUniqueWordsCount(), is(equalTo(wordMap)));
	}
	
	@Test
	public void test_two_word_string() {
		String text="TDD is";
		Map<String,Integer> wordMap=new HashMap<>();
		wordMap.put("tdd", 1);
		wordMap.put("is", 1);
		assertThat(new WordCounter(text).getUniqueWordsCount(), is(equalTo(wordMap)));
	}
	
	@Test
	public void test_two_same_words_and_should_return_single_word_with_count_two() {
		String text="TDD TDD";
		Map<String,Integer> wordMap=new HashMap<>();
		wordMap.put("tdd", 2);
		assertThat(new WordCounter(text).getUniqueWordsCount(), is(equalTo(wordMap)));
	}
	
	@Test
	public void test_three_words_with_two_words_as_same_should_return_two_words_with_counters() {
		String text="test driven test";
		Map<String,Integer> wordMap=new HashMap<>();
		wordMap.put("test", 2);
		wordMap.put("driven", 1);
		assertThat(new WordCounter(text).getUniqueWordsCount(), is(equalTo(wordMap)));
	}
	
	@Test
	public void test_words_count_with_external_delimiter() {
		String text="test,driven,test";
		Map<String,Integer> wordMap=new HashMap<>();
		wordMap.put("test", 2);
		wordMap.put("driven", 1);
		assertThat(new WordCounter(text,",").getUniqueWordsCount(), is(equalTo(wordMap)));
	}
	
	@Test
	public void test_to_ignore_case_in_words() {
		String text="Test,driven,test";
		Map<String,Integer> wordMap=new HashMap<>();
		wordMap.put("test", 2);
		wordMap.put("driven", 1);
		assertThat(new WordCounter(text,",").getUniqueWordsCount(), is(equalTo(wordMap)));
	}
}
