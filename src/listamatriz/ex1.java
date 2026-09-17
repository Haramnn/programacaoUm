package listamatriz;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        double[][] n = new double[3][4]; 
 
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Nota da avaliação "+(j+1)+" do aluno "+(i+1));
                n[i][j] = sc.nextDouble();
            }
        }
 
    
        System.out.println("Notas dos alunos:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Aluno "+(i+1)+": ");
            for (int j = 0; j < 4; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
 
        sc.close();

	}

}
