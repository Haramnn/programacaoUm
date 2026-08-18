package lista1scanner;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String aluno = sc.nextLine();
		String curso = sc.nextLine();
		int idade = sc.nextInt();

		System.out.println("==============================");
		System.out.println("Aluno: " + aluno);
		System.out.println("Curso: " + curso);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("==============================");

		sc.close();
	}
}