package br.com.designPatterns.cap5;

public class RaizQuadrada implements ExpressaoMatematica {

	private ExpressaoMatematica numeroDaRaiz;

	public RaizQuadrada(ExpressaoMatematica numeroDaRaiz){
		this.numeroDaRaiz = numeroDaRaiz;
	}

	@Override
	public int avalia() {
		int valorNumeroDaRaiz = numeroDaRaiz.avalia();
		return (int) Math.sqrt(valorNumeroDaRaiz);
	}
	
	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaRaizQuadrada(this);
	}

	public int getRaizQuadrada() {
		return numeroDaRaiz.avalia();
	}
}
