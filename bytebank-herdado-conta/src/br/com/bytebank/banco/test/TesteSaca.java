package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
	
	public static void main(String[] args) {
		Conta c = new ContaCorrente(222, 222);
		
		c.deposita(200.0);
		System.out.println(c.getSaldo());
		try {
			c.saca(200);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println(c.getSaldo());
	}
}
