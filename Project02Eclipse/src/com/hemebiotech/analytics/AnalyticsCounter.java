package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	ISymptomReader reader;
	ISymptomWriter writer;
	
	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) { 
		
		this.reader = reader;
		this.writer = writer;
		
	}
	
	
	
	
	public List<String> getSymptoms() { 
		
		return reader.GetSymptoms();
		
	}
	
	/**
	 * This method will count the number of occurrences for each symptom
	 * and add them to a list (key, value) with the symptom name as key 
	 * and as value the number of occurrences.
	 * @param symptoms retrieves the input symptom list.
	 * @return returns the list (key, value).
	 * 
	 */
		
		public Map<String, Integer> countSymptoms(List<String> symptoms) { 
			
			Map<String, Integer> result = new HashMap<String, Integer>();
			int count = 0 ;
		
			 for(String symptom : symptoms) {
					for(int j = 0; j < symptoms.size(); j++){
						if(symptom.equals(symptoms.get(j))) {	
							++count;
						}			
					}
					result.put(symptom, count);
					count = 0;
					}
			 return result;
		}
		
		/**
		 * The sortSymptoms method sorts in alphabetical order.
		 * @param symptoms retrieves the list (key, value)
		 * @return returns the list in alphabetical order.
		 */
		
		public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
			
			Map<String, Integer> result = new TreeMap<String, Integer>();
			
			result.putAll(symptoms);
	
			return result;		
		}
		
		
		public void writeSymptoms(Map<String, Integer> symptoms) { 
			
			writer.writeSymptoms(symptoms);
			
		}
		
}