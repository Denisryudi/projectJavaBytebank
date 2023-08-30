package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {

	public static void main(String[] args) {
		Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);

        
        
        
        
        String diaComoTexto = "29";
        int dia = Integer.valueOf(diaComoTexto);
        int traducao = Integer.parseInt(diaComoTexto);
        
        System.out.println(dia);
        System.out.println(traducao);
        
        
        System.out.println("-----------------------");
        
        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue()); //unboxing


        Double dRef = Double.valueOf(3.2);//autoboxing
        System.out.println(dRef.doubleValue());//unboxing
        
        
        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());
        
        
        Number refNumero = Integer.valueOf(29);
        Number refNumero1 = Double.valueOf(30);
        
        System.out.println(refNumero);
        System.out.println(refNumero1);
        
        System.out.println("------------------------");
        
        
       List<Number> lista = new ArrayList<Number>();
       lista.add(10);
       lista.add(12);
       lista.add(10.5);
       
       
       boolean existe = lista.contains(2);
       System.out.println(existe);
       
       
       System.out.println(lista.size());
       
      for(Object oRef : lista) {
    	  System.out.println(oRef);
      }
	}
	
	

}