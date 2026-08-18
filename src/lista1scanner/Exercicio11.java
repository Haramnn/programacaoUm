package lista1scanner;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomeAluno = sc.nextLine();
		int nota = sc.nextInt();
		int frequencia = sc.nextInt();

		String resultado = (nota >= 6 && frequencia >= 75) ? "Aprovado" : "Reprovado";

		System.out.println("Aluno: " + nomeAluno);
		System.out.println("Resultado: " + resultado);

		sc.close();
	}
}