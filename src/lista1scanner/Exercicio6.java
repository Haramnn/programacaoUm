package lista1scanner;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valorDollar = sc.nextDouble();
		double cotacaoDollar = sc.nextDouble();

		double valorReais = valorDollar * cotacaoDollar;

		System.out.printf("O monitor custa %.2f reais%n", valorReais);

		sc.close();
	}
}