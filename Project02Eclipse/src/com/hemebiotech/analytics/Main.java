package com.hemebiotech.analytics;

public class Main {

	public static void main(String[] args) {
		
		//ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		//ISymptomWriter writer = new WriteSymptomDataToFile();
		AnalyticsCounter count = new AnalyticsCounter(new ReadSymptomDataFromFile("symptoms.txt"), new WriteSymptomDataToFile());
		
		/**
		 * Call up the different methods in order.
         * 1 - Read the file and store the different lines in a list.
         * 2 - Count the number of occurrences for each symptom.
         * 3 - Sort Symptoms alphabetically.
         * 4 - Create a file by writing the Symptoms with their number of occurrences in alphabetical order.
		 */
		
		count.getSymptoms();
		count.countSymptoms(count.getSymptoms());
		count.sortSymptoms(count.countSymptoms(count.getSymptoms()));
		count.writeSymptoms(count.sortSymptoms(count.countSymptoms(count.getSymptoms())));
		
	}
}