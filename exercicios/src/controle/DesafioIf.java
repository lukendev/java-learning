package controle;

public class DesafioIf {

	public static void main(String[] args) {

		double nota = 1.3;

		if (nota >= 9.0); // Erro ";"
		{
			System.out.println("Quadro de Honra!");
			System.out.println("Voc� � fera!!!");
		}
		
		if (nota >= 9.0) {
			System.out.println("Quadro de Honra!");
			System.out.println("Voc� � fera!!!");
		}

		// Mesmo com 1.3 de NOTA, o t�rmino da senten�a ";" ap�s a
//		condicional fez com que o bloco de c�digo n�o dependesse da condi��o para ser executado
	}
}
