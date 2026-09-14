package exlaco;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite um número: ");
        int num = sc.nextInt();

        int cont = 1;

        while (cont <= 10) {
            System.out.println(num + " x " + cont + " = " + (num * cont));
            cont++;
        }
		
		sc.close();
	}

}
