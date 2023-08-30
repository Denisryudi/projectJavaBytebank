package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestIterator {
	
	public static void main(String[] args) {
		
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		Iterator<String> it = nomes.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}
		
		
		System.out.println("-----------------------------");
		
		
		Set<String> nomes1 = new HashSet<>();
		nomes1.add("Super Mario");
		nomes1.add("Yoshi"); 
		nomes1.add("Donkey Kong"); 

		Iterator<String> it1 = nomes1.iterator();

		while(it1.hasNext()) {
		  System.out.println(it1.next());
		}
		
		
		
	}
}
