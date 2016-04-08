package com.tdd.exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

	private String text;
	private static final String DEFAULT_DELIMITOR = " ";

	public WordCounter(String text) {
		this.text = text;
	}

	public Map<String, Integer> getUniqueWordsCount() {
		return getWordsFrequency(text);
	}

	private Map<String, Integer> getWordsFrequency(String text) {
		Map<String, Integer> wordMap = new HashMap<>();
		
		if (null == text || text.isEmpty())
			return wordMap;
		
		Arrays.stream(text.split(DEFAULT_DELIMITOR)).forEach(word -> {
			Integer counter = wordMap.getOrDefault(word,0);
			wordMap.put(word, ++counter);
		});

		return wordMap;
	}
}
