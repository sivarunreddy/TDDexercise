package com.tdd.exercise;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

	private String text;
	private static final String DEFAULT_DELIMITOR=" ";

	public WordCounter(String text) {
		this.text = text;
	}

	public Map<String, Integer> getUniqueWordsCount() {
		Map<String,Integer> wordMap=new HashMap<>();
		if(!text.isEmpty()){
			String[] words=text.split(DEFAULT_DELIMITOR);
			for(String word:words){
				wordMap.put(word, 1);
			}
		}
			
		return wordMap;
	}

}
