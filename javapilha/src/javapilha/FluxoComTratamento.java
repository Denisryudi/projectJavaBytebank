package javapilha;

public class FluxoComTratamento {
	
    public static void main(String[] args) throws MinhaExcecao{
        System.out.println("Ini do main");
        try {
        metodo1();
        } catch(Exception ex) {
        	
        	String msg = ex.getMessage();
        	System.out.println("Exception" + msg);
        	ex.printStackTrace();

        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
       
        
        
        //sai abruptamente do código, ou seja a linha de baixo nao vai funcionar
        //System.out.println("Fim do metodo2");<- "linha de baixo"
    }
}
