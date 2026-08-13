package lista2;

public class ex13 {

	public static void main(String[] args) {
		
		 	boolean possuiCNH = true;
	        boolean possuiCarro = false;
	        boolean possuiDinheiro = true;

	        // Possui CNH e carro
	        System.out.println(possuiCNH && possuiCarro);

	        // Possui carro ou dinheiro
	        System.out.println(possuiCarro || possuiDinheiro);

	        // Não possui CNH
	        System.out.println(!possuiCNH);

	        // Possui CNH e dinheiro
	        System.out.println(possuiCNH && possuiDinheiro);

	        // Não (possui carro ou dinheiro)
	        System.out.println(!(possuiCarro || possuiDinheiro));

	}

}
