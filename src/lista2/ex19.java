package lista2;

public class ex19 {

	public static void main(String[] args) {
		
		double saldo = 1250.00;

        String situacao = (saldo > 0)
                ? "Saldo positivo"
                : "Saldo negativo";

        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Situação: " + situacao);

	}

}
