package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class AnalyticsCounter {
	
		
		public Map<String, Integer> countSymptoms(List<String> symptoms) { 
			
			
			Map<String, Integer> test= new HashMap<String, Integer>();
			int test3 = 0 ;
		
			 for(String test2 : symptoms) {
					for(int j = 0; j < symptoms.size(); j++){
						if(test2.equals(symptoms.get(j))) {	
							++test3;
						}			
					}
					test.put(test2, test3);
						 test3 = 0;
					}
			 return test;
		}
		
		
		public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
			
			Map<String, Integer> test4 = new TreeMap<String, Integer>();
			
			test4.putAll(symptoms);
			
		
			
			return test4;
		
			
		}
}
