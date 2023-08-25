package br.com.bytebank.banco.modelo;

public class TesteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nome = "ALURA";
		CharSequence cs = new StringBuilder("al");

		nome = nome.replace("AL", cs);

		System.out.println(nome);
	}

}
