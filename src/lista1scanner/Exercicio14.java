package lista1scanner;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome = sc.nextLine();
		double salario = sc.nextDouble();
		int tempoEmpresa = sc.nextInt();

		double bonus = tempoEmpresa >= 5 ? 500.00 : 0.00;
		double salarioFinal = salario + bonus;

		System.out.println("Nome: " + nome);
		System.out.println("Salário: " + salario);
		System.out.println("Bônus: " + bonus);
		System.out.println("Salário Final: " + salarioFinal);

		sc.close();
	}
}