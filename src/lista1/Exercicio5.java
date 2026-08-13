package lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double arroz = 27.90, feijao = 9.80, oleo = 8.50;
		double soma = arroz+feijao+oleo;
		
		System.out.println("Total: " + soma);
		System.out.println(soma/3);
		
		sc.close();
		
	}

}
