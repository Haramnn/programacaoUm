package lista1scanner;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numA = sc.nextInt();
		int numB = sc.nextInt();

		int divisao = numA / numB;
		double divisaoPF = (double) numA / numB;

		System.out.println(divisao);
		System.out.println(divisaoPF);

		sc.close();
	}
}
