package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymptomWriter {
	
	/**
	 * The writeSymptoms method is used to write a list of symptoms and their number of occurrences to a file.
	 * @param symptoms recovers the list sorted alphabetically.
	 */
	
	public void writeSymptoms(Map<String, Integer> symptoms) ;

}