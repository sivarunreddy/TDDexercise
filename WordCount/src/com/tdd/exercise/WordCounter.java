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
				Integer counter=wordMap.get(word);
				if(null==counter)
					counter=1;
				else
					counter++;
				wordMap.put(word, counter);
			}
		}
			
		return wordMap;
	}

}
