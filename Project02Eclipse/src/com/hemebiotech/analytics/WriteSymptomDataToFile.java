package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Map;
import java.util.Set;


public class WriteSymptomDataToFile implements ISymptomWriter{
	
	
	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) {
		
			 StringBuilder builder = new StringBuilder();
			 
			 Set<String> cles = symptoms.keySet();
			 
		        for(String cle : cles) {
		            Integer valeur = symptoms.get(cle);
		            builder.append("number of " + cle + ": " + valeur + "\n");
		        }
		            
					try {
						BufferedWriter writer = new BufferedWriter(new FileWriter("resultats.txt"));
						writer.write(builder.toString());
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
			
					}
			} 
	
	
	}


