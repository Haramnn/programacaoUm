package lista2;

public class ex20 {

	public static void main(String[] args) {
	
		int idade = 70;

        String atendimento = (idade >= 60)
                ? "Atendimento preferencial"
                : "Atendimento comum";

        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tipo de atendimento: " + atendimento);

	}

}
