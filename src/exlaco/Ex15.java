package exlaco;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		
		for(int i = 0; i<5; i++) {
			System.out.println("Digite uma nota");
			int nota = sc.nextInt();
			
			soma+=nota;
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + (soma/5));
		
		sc.close();
	}

}
