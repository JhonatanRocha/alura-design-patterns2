package br.com.designPatterns.cap4;

public class Multiplicacao implements ExpressaoMatematica {

	private ExpressaoMatematica direita;
	private ExpressaoMatematica esquerda;

	public Multiplicacao(ExpressaoMatematica esquerda, ExpressaoMatematica direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		return valorDaEsquerda * valorDaDireita;
	}
}
