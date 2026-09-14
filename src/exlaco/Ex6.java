package exlaco;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Informe o número inicial: ");
		int i = sc.nextInt();
		
		System.out.println("Informe o número final: ");
		int fim =  sc.nextInt();
		
		while(i <= fim) {
			System.out.println(i);
			i++;
		}
		
		sc.close();
	}

}
