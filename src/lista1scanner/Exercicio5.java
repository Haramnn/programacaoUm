package lista1scanner;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double arroz = sc.nextDouble();
		double feijao = sc.nextDouble();
		double oleo = sc.nextDouble();

		double soma = arroz + feijao + oleo;
		double media = soma / 3;

		System.out.println("Total: " + soma);
		System.out.println("Média: " + media);

		sc.close();
	}
}