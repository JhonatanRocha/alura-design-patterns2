package br.com.designPatterns.cap4;

public class Subtracao implements ExpressaoMatematica {

	private ExpressaoMatematica esquerda;
	private ExpressaoMatematica direita;

	public Subtracao(ExpressaoMatematica esquerda, ExpressaoMatematica direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		return valorDaEsquerda - valorDaDireita;
	}
}
