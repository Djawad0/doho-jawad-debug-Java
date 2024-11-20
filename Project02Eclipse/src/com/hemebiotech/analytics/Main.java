package com.hemebiotech.analytics;

public class Main {
	

	public static void main(String[] args) {
		
		ISymptomReader test1 = new ReadSymptomDataFromFile("symptoms.txt");
		ISymptomWriter test2 = new WriteSymptomDataToFile();
		AnalyticsCounter test3 = new AnalyticsCounter();
		
		test1.GetSymptoms();
		test3.countSymptoms(test1.GetSymptoms());
		test3.sortSymptoms(test3.countSymptoms(test1.GetSymptoms()));
		test2.writeSymptoms(test3.sortSymptoms(test3.countSymptoms(test1.GetSymptoms())));
		
		

	}

}
