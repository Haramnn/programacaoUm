package exlaco;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		String op;
		double somaNotas = 0;
		double media = 0;
		int numAlunos = 0;
		
		do {
			
			System.out.println("Digite o nome do aluno: ");
			String nome = sc.nextLine();
			numAlunos++;
			
			System.out.println("Digite a nota: ");
			double nota = sc.nextDouble();
			sc.nextLine();
			
			somaNotas+=nota;
			media = somaNotas/numAlunos;
            
			System.out.println("Deseja cadastrar outro aluno? (S/N)");
            op = sc.nextLine();
			
		} while(op.toUpperCase().equals("S"));
		
		System.out.println("Nota Média: " + media);
		
		sc.close();
	}

}
