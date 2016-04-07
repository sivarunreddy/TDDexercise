package com.tdd.exercise;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

	private String text;

	public WordCounter(String text) {
		this.text = text;
	}

	public Map<String, Integer> getUniqueWordsCount() {
		return new HashMap<>();
	}

}
