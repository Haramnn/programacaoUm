package exlaco;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int total = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe o " + (i + 1) + "º número: ");
			total += sc.nextInt();
		}
		
		System.out.println("Soma total: " + total);
		
		sc.close();
	}

}
