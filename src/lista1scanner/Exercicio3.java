package lista1scanner;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numA = sc.nextInt();
		int numB = sc.nextInt();

		System.out.println("Soma: " + (numA + numB));
		System.out.println("Subtração: " + (numA - numB));
		System.out.println("Multiplicação: " + (numA * numB));
		System.out.println("Divisão: " + (numA / numB));
		System.out.println("Resto: " + (numA % numB));

		sc.close();
	}
}