package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		Heroi heroi = new Heroi(10, 11);
		heroi.x = 10;
		heroi.y = 11;
		
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + monstro.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);

		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
	}
}
