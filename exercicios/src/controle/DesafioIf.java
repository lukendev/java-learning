package controle;

public class DesafioIf {

	public static void main(String[] args) {

		double nota = 1.3;

		if (nota >= 9.0); // Erro ";"
		{
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!!!");
		}
		
		if (nota >= 9.0) {
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!!!");
		}

		// Mesmo com 1.3 de NOTA, o término da sentença ";" após a
//		condicional fez com que o bloco de código não dependesse da condição para ser executado
	}
}
