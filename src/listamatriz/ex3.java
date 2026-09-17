package listamatriz;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
        int[][] e = new int[3][4];
        int et = 0;
        int me = 0;
        int pme = 0;
 
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                System.out.println("Estoque do produto "+(i+1)+" no período "+(j+1));
                e[i][j] = sc.nextInt();
            }
        }
 
        

        for (int i = 0; i < e.length; i++) {
            int tp = 0;
 
            for (int j = 0; j < e[i].length; j++) {
                tp += e[i][j];
            }
 
            System.out.println("Produto "+(i+1)+": "+tp+" unidades");
 
            et += tp;
 
            if (tp > me) {
                me = tp;
                pme = i + 1;
            }
        }
 
        System.out.println("Estoque total: "+et+" unidades");
        System.out.println("Maior estoque acumulado: Produto "+pme);
 
        sc.close();

	}

}
