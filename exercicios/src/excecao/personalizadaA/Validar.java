package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {

	public Validar() {} 
	
	public static void aluno(Aluno aluno) {
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno est� nulo!");
		}
		
		if(aluno == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}
}
