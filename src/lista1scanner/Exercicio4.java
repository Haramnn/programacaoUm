package lista1scanner;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome = sc.nextLine();
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2) / 2;

		System.out.println("Aluno: " + nome);
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média: " + media);

		sc.close();
	}
}