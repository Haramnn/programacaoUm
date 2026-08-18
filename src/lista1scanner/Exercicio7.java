package lista1scanner;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		int salarioInteiro = (int) salario;
		double novoSalario = (double) salarioInteiro;

		System.out.println(salario);
		System.out.println(salarioInteiro);
		System.out.println(novoSalario);

		sc.close();
	}
}