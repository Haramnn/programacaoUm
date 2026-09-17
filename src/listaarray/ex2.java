package listaarray;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [] n = new int [10];
		int m = 0;
		int pm = 0;
		int me = 9999;
		int pme = 0;
		
		for (int i = 0; i < n.length ; i++) {
			
			System.out.println("Dígite o número para a posição " + (i+1));
			n [i] = sc.nextInt();
			
			if (m < n [i]) {
				m = n[i];
				pm = i + 1;
			}
			if (me > n[i]) {
				me = n[i];
				pme = i + 1;
			}
		}
		
		System.out.println("Números");
		
		for (int i = 0; i < n.length ; i++) {
			System.out.print(n[i]+ " ");
			
		}
		
		System.out.println("\nMaior valor: " + m);
        System.out.println("Posição do maior: " + pm);
        System.out.println("Menor valor: " + me);
        System.out.println("Posição do menor: " + pme);
        
		sc.close();

	}

}
