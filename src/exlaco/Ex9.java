package exlaco;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int op;
		
		do {
			
			System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Excluir");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            
            op = sc.nextInt();
			
		} while(op != 0);
		
		System.out.println("Programa Encerrado!");
		
		sc.close();
	}

}
