package br.com.bytebank.banco.test;

public class TesteArrayPrimitivos {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		idades[0] = 29;
		System.out.println(idades[0]);
		
		
		for(int i = 0; i < idades.length; i ++) {
			idades[i] = i * i;
			System.out.println(idades[i]);
		}
		
		
		try {
			System.out.println(idades[5]);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Ex: " + ex.getMessage() );
		}
		
		double[] decimal = new double[5];
		decimal[0] = 1.5;
		System.out.println(decimal[0]);
		
	}

}
