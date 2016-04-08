package com.tdd.exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

	private String text;
	private String delimiter;
	private static final String DEFAULT_DELIMITER = " ";

	public WordCounter(String text) {
		this.text = text;
		delimiter=DEFAULT_DELIMITER;
	}
	
	public WordCounter(String text,String delimiter) {
		this.text = text;
		this.delimiter=delimiter;
	}

	public Map<String, Integer> getUniqueWordsCount() {
		return getWordsFrequency(text);
	}

	private Map<String, Integer> getWordsFrequency(String text) {
		Map<String, Integer> wordMap = new HashMap<>();
		
		if (null == text || text.isEmpty())
			return wordMap;
		
		Arrays.stream(text.split(delimiter)).forEach(word -> {
			Integer counter = wordMap.getOrDefault(word.toLowerCase(),0);
			wordMap.put(word.toLowerCase(), ++counter);
		});

		return wordMap;
	}
}
