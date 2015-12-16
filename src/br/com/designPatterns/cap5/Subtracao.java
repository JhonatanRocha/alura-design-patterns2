package br.com.designPatterns.cap5;

public class Subtracao implements ExpressaoMatematica {

	private ExpressaoMatematica esquerda;
	private ExpressaoMatematica direita;

	public Subtracao(ExpressaoMatematica esquerda, ExpressaoMatematica direita) {
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
		return valorDaEsquerda - valorDaDireita;
	}
	
	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaSubtracao(this);
	}
}
