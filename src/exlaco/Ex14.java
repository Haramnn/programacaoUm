package exlaco;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		
		System.out.println("Digite um número: ");
		int N = sc.nextInt();

	
		for(int i = 1; i<=N; i++) {
			total += i;
		}
		
		System.out.println("Total: " + total);
		
		sc.close();
	}

}
