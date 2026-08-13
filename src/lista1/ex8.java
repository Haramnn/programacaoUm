package lista1;

public class ex8 {

	public static void main(String[] args) {
		
		boolean possuiingresso = true;
		boolean possuidocumento = false;
		boolean acompanhanteMaiorIdade = true;
		
		System.out.println(possuiingresso && possuidocumento);
	        // false - possui ingresso, mas não possui documento.

	    System.out.println(possuiingresso || possuidocumento);
	        // true - possui pelo menos uma das condições.

	    System.out.println(!possuidocumento);
	        // true - não possui documento.

	    System.out.println(possuiingresso && (possuidocumento || acompanhanteMaiorIdade));
	        // true - possui ingresso e está acompanhado por um maior de idade.

	    System.out.println(!(possuiingresso && possuidocumento));
	        // true - não é verdade que possui ingresso e documento ao mesmo tempo.
		

	}

}
