package exlaco;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int senha;
		
		do {
			
			System.out.println("Informe a senha: ");
			senha = sc.nextInt();
			
		} while(senha != 1234);
		
		System.out.println("Senha Correta!");
		
		sc.close();
	}

}
