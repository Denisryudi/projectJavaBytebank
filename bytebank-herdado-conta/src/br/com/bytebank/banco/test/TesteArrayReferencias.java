package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	public static void main(String[] args) {
		
		Conta [] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 23);
		contas[1] = cc2;
		
		ContaPoupanca ref = (ContaPoupanca) contas[1];
		//ref tem que estar apontando pra si
		//System.out.println(cc2.getNumero());
		System.out.println(contas[0].getNumero());
		System.out.println(ref);
		
		

	}
	
}
