package lista1scanner;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean possuiIngresso = sc.nextBoolean();
		boolean possuiDocumento = sc.nextBoolean();
		boolean acompanhanteMaiorIdade = sc.nextBoolean();

		System.out.println(possuiIngresso && possuiDocumento);
		System.out.println(possuiIngresso || possuiDocumento);
		System.out.println(!possuiDocumento); 
		System.out.println(possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade)); 
		System.out.println(!(possuiIngresso && possuiDocumento)); 
		
		sc.close();
	}
}