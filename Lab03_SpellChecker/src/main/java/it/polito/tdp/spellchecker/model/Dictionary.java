package it.polito.tdp.spellchecker.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Dictionary {
	
	private List <String> dizionarioInglese = new LinkedList<>();
	private List <String> dizionarioItaliano = new LinkedList<>();

	public boolean addDictionary(String value) {
		
		if(value.equals("English")) {
			try {
				FileReader fr = new FileReader("C:\\Users\\djonk\\git\\Lab03\\Lab03_SpellChecker\\target\\classes\\English.txt");
				BufferedReader bf = new BufferedReader(fr);
				
				String word = "";
				
				while((word = bf.readLine())!= null) {
					dizionarioInglese.add(word);
				}
			}catch(IOException e) {
				
				System.out.println(e.getMessage());
				return false;
			}
		}else 
			if(value.toLowerCase().equals("italian")) {
				try {
					FileReader fr = new FileReader("C:\\Users\\djonk\\git\\Lab03\\Lab03_SpellChecker\\target\\classes\\Italian.txt");
					BufferedReader bf = new BufferedReader(fr);
					
					String word = "";
					
					while((word = bf.readLine())!= null) {
						dizionarioItaliano.add(word);
					}
				}catch(IOException e) {
					System.out.println(e.getMessage());
					return false;
				}
		
	}
		return true;
	}

	public List<String> getDizionarioInglese() {
		return dizionarioInglese;
	}

	public List<String> getDizionarioItaliano() {
		return dizionarioItaliano;
	}

	public void clear() {
		dizionarioInglese.clear();
		dizionarioItaliano.clear();
		
	}
	
	
	
	
	
}
