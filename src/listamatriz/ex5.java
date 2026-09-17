package listamatriz;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       
	        double[][] n = new double[5][4];
	        double[] ma = new double[5];
	        int pmm = 0;
	        int pmem = 0;
	        double sg = 0;
	        int ap = 0;
	 
	        for (int i = 0; i < n.length; i++) {
	        	double soma = 0;
	            for (int j = 0; j < n[i].length; j++) {
	                System.out.println("Nota da avaliação "+(j+1)+" do aluno "+(i+1));
	                n[i][j] = sc.nextDouble();
	                
	                soma += n[i][j];
	            }
	            ma[i] = soma / n[i].length;
	            
	            if (ma[i] > ma[pmm]) {
	                pmm = i;
	            }
	            if (ma[i] < ma[pmem]) {
	                pmem = i;
	            }
	            
	            sg += ma[i];
	            
	            if (ma[i] >= 7.0) {
	                ap++;
	            }
	        }
	        
	        double mg = sg / n.length;
	 
	        System.out.println("\nNotas:");
	        for (int i = 0; i < n.length; i++) {
	            System.out.print("Aluno "+(i+1)+": ");
	            for (int j = 0; j < n[i].length; j++) {
	                System.out.print(n[i][j]+" ");
	            }
	            System.out.println();
	        }
	        
	         System.out.println("\nMédias");
	         
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Aluno "+(i+1)+" - Média: "+ ma[i]);    
	        }
	        System.out.println("\nMaior média: Aluno " +(pmm+1)+" - "+ma[pmm]);
	        System.out.println("Menor média: Aluno " +(pmem+1)+" - "+ ma[pmem]);
	        System.out.println("Média da turma: " +mg);
	        System.out.println("Alunos aprovados: " +ap);
	 
	        sc.close();

	}

}
