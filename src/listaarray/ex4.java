package listaarray;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int par = 0;
        int impar = 0;
        int m10 = 0;
        int me10 = 0;
		
		int [] n = new int[15];
		
		for (int i = 0; i < n.length; i++) {
			System.out.println("Dígite um número para a posição "+(i+1));
			n[i] = sc.nextInt();
			
			if (n[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
 
            if (n[i] > 10) {
                m10++;
            } else {
                me10++;
            }
	
		}
 
        System.out.println("Quantidade de pares: " + par);
        System.out.println("Quantidade de ímpares: " + impar);
        System.out.println("Maiores que 10: " + m10);
        System.out.println("Menores ou iguais a 10: " + me10);
		sc.close();

	}

}
