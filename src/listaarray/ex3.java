package listaarray;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String [] alunos = new String [8];
		boolean encontrado = false;
		int posicao  = 0;
		
		for (int i = 0; i < alunos.length; i++) {
			
			System.out.println("Dígite o nome do aluno "+(i+1));
			alunos [i] = sc.nextLine();
		}
		
		System.out.println("Dígite o nome do aluno que deseja procurar:");
		String procurar = sc.nextLine();
		
		for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].equals(procurar)) {
                encontrado = true;
                posicao = i;
                break;
            }
        }
		
		if (encontrado) {
            System.out.println("Aluno encontrado na posição: " + posicao);
        } else {
            System.out.println("Aluno não encontrado.");
        }
		
		sc.close();

	}

}
