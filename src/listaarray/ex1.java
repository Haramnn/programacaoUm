package listaarray;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [] notas =  new double [5];
		double media = 0;
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println("Informe a nota do aluno " + (i+1));
			notas [i] = sc.nextDouble();
			
		}
		
		for (int i = 0; i < notas.length; i++) {
			
			media += notas[i];
			
			System.out.println("Aluno "+ (i + 1)+ " nota: "+ notas[i]);
		}
		
		System.out.println("média da turma: "+ (media/notas.length));
		
		
		sc.close();

	}

}
