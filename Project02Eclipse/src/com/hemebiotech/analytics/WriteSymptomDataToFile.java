package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 * This class will be used to create the symptom file
 * and their number of occurrences. 
 */

public class WriteSymptomDataToFile implements ISymptomWriter{

	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) {
		
			 StringBuilder builder = new StringBuilder();
			 
			 Set<String> cles = symptoms.keySet();
			 
		        for(String cle : cles) {
		            int valeur = symptoms.get(cle);
		            builder.append("number of " + cle + ": " + valeur + "\n");
		        }
		            
					try {
						BufferedWriter writer = new BufferedWriter(new FileWriter("result.out"));
						writer.write(builder.toString());
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();		
					}
			} 
	}