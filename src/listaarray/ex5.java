package listaarray;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double[] n = new double[10];
        double soma = 0;
        double m = 0;
        double me = 999;
        int a = 0;
 
        for (int i = 0; i < n.length; i++) {
            System.out.println("Informe o valor " +(i+1));
            n[i] = sc.nextDouble();	
            
            soma += n[i];
            
            if (m < n [i]) {
				m = n[i];
			}
            
			if (me > n[i]) {
				me = n[i];
			}
			
        }
        
        double media = soma / n.length;
        
        System.out.println("Valores");
        
        for (int i = 0; i < n.length; i++) {
        	if (n[i] > media) {
        		a++;
        	}
        	
        	System.out.print(n[i]+" ");
        }
        
        System.out.println("\nSoma dos valores: " +soma);
        System.out.println("Média: " +media);
        System.out.println("Maior valor: " +m);
        System.out.println("Menor valor: " +me);
        System.out.println("Quantidade acima da média: " +a);
        
                     
            
		sc.close();

	}
}
