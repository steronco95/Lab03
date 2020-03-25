package it.polito.tdp.spellchecker.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Dictionary {

	private List<String> englishDictionary = new LinkedList<>();
	
	public void loadDictionary(String id) {
		
		if(id.equals("English")) {
			 try {
				 FileReader fr = new FileReader("English.txt");
				 BufferedReader bf = new BufferedReader(fr);
				 String word;
				 while((word = bf.readLine())!= null) {
					 englishDictionary.add(word);
				 }
				 bf.close();
			 }catch(IOException e ) {
				 e.getMessage();
			 }
		}
		
	}
	
	public String getDictionary() {
		StringBuffer result = new StringBuffer();
		
		for(String s : englishDictionary) {
			result.append(s).append("\n");
		}
		
		return result.toString();
	}

}
