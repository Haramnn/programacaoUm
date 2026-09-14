package exlaco;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int num = 0;
		int soma = 0;
		
		while(num >= 0) {
			soma += num;
			
			System.out.println("Digite um número: ");
			num = sc.nextInt();	
		}
		
		System.out.println("Soma: " + soma);
		
		sc.close();
	}

}
