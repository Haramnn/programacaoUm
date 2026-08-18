package lista1scanner;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomeProduto = sc.nextLine();
		int codigo = sc.nextInt();
		double preco = sc.nextDouble();
		int quantEstoque = sc.nextInt();

		System.out.println("Produto: " + nomeProduto);
		System.out.println("Código: " + codigo);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + quantEstoque);

		sc.close();
	}
}