package it.polito.tdp.spellchecker.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Model {

	private String inserimento;
	private List<String> paroleInserite = new LinkedList<>();

	public void setInserimento(String ins) {
		this.inserimento = ins;
		
	}
	
	public void creaParola() {
		
		String [] ins = inserimento.split(" ");
		
		paroleInserite = Arrays.asList(ins);
		
//		for(String s : ins) {
//			RichWord rw = new RichWord(s);
//			paroleInserite.add(rw);
//			
//		}
		
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		
		for(String s : paroleInserite) {
			
			result.append(s).append("\n");
		}
		
		return result.toString();
	}
}
