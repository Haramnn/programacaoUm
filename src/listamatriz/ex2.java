package listamatriz;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        int[][] m = new int[4][4];
        int soma = 0;
        int ma = 0;
        int me = 999;
 
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Elemento [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
                
                soma += m[i][j];
                
                if (m[i][j] > ma) {
                    ma = m[i][j];
                }
                if (m[i][j] < me) {
                    me = m[i][j];
                }
            }
        }

        double media = soma / (m.length *m[0].length);
 
        
        System.out.println("Matriz:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
 
        System.out.println("\nSoma de todos os elementos: " + soma);
        System.out.println("Média dos elementos: " + media);
        System.out.println("Maior elemento: " + ma);
        System.out.println("Menor elemento: " + me);
 
        sc.close();

	}

}
