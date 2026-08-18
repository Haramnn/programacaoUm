package lista1scanner;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome = sc.nextLine();
		int idade = sc.nextInt();
		double altura = sc.nextDouble();
		double peso = sc.nextDouble();
		char sexo = sc.next().charAt(0);
		boolean matricula = sc.nextBoolean();

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Sexo: " + sexo);
		System.out.println("Matrícula: " + matricula);

		sc.close();
	}
}