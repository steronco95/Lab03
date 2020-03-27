package it.polito.tdp.spellchecker.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Model {

	private String inserimento;
	private List<String> paroleInserite = new LinkedList<>();
	private Dictionary dictionary = new Dictionary();
	private int countErrori = 0;
	private List<String> errori = new LinkedList<>();
	private String value;
	
	public void setInserimento(String ins) {
		String testo = ins.replaceAll("[.,\\/#!?$%\\^&\\*;:{}=\\-_`~()\\[\\]\"]", "");
		
		String [] wrd = testo.split(" ");
		
		for(String s : wrd) {
			paroleInserite.add(s);
		}
		
			
	}
	
	public boolean addDictionary(String value) {
		
		this.value = value;
		
		return dictionary.addDictionary(value);
	}
	
	public int errori(String string) {
		
		if(string.equals("English")) {
			for(String s : paroleInserite) {
				if(!dictionary.getDizionarioInglese().contains(s)) {
					countErrori++;
					errori.add(s);
				}
			}
			return countErrori;
			
		}else if(string.equals("Italian")) {
			for(String s : paroleInserite) {
				if(!dictionary.getDizionarioItaliano().contains(s)) {
					countErrori++;
					errori.add(s);
				}
			}
			
			return countErrori;
		}
		
		return -1;
	}
	
	public String stampaErorri() {
		
		StringBuffer result = new StringBuffer();
		
			for(String s : paroleInserite) {
				result.append(s).append("\n");
			}
			
			return result.toString();
		
		
	}
	
	
}
