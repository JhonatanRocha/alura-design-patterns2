package br.com.designPatterns.cap4;

public class Divisao implements ExpressaoMatematica {

	private ExpressaoMatematica direita;
	private ExpressaoMatematica esquerda;

	public Divisao(ExpressaoMatematica esquerda, ExpressaoMatematica direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		return valorDaEsquerda / valorDaDireita;
	}
}
