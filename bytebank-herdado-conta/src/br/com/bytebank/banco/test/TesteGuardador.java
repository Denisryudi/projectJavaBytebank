package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardador {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adicionar(cc);
		
		Conta cc1 = new ContaCorrente(22, 22);
		guardador.adicionar(cc1);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println("Tem:" + tamanho + " elementos");
		
		Conta ref = guardador.getReferencia(1);
		
		System.out.println(ref.getNumero());
	}

}
