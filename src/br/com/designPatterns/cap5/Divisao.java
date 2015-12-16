package br.com.designPatterns.cap5;

public class Divisao implements ExpressaoMatematica {

	private ExpressaoMatematica direita;
	private ExpressaoMatematica esquerda;

	public Divisao(ExpressaoMatematica esquerda, ExpressaoMatematica direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	public ExpressaoMatematica getEsquerda() {
		return esquerda;
	}
	
	public ExpressaoMatematica getDireita() {
		return direita;
	}

	@Override
	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		return valorDaEsquerda / valorDaDireita;
	}
	
	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaDivisao(this);;
	}
}
