package lista1scanner;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double temperatura = sc.nextDouble();

		String resultado = (temperatura > 25) ? "Dia quente" : "Dia agradável";

		System.out.println("Temperatura: " + temperatura + "°C");
		System.out.println("Situação: " + resultado);

		sc.close();
	}
}