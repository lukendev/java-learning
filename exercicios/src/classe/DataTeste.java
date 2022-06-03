package classe;

import java.util.Scanner;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Data data = new Data();
		
		System.out.print("Digite o dia: ");
		data.dia = entrada.nextInt();
		
		System.out.print("\nDigite o mês: ");
		data.mes = entrada.nextInt();
		
		System.out.print("\nDigite o ano: ");
		data.ano = entrada.nextInt();
		
		
		System.out.printf("Data inserida: %d/%d/%d", data.dia, data.mes, data.ano);
		

		entrada.close();
		
	}

}
