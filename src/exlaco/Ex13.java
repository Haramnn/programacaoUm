package exlaco;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		System.out.println("Tabuada...");
		
		for(int i = 0; i<=10; i++) {
			System.out.printf("%d X %d = %d \n", num, i, (num*i));
		}
		
		sc.close();
	}

}
