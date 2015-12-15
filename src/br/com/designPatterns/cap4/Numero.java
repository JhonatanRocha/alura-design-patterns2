package br.com.designPatterns.cap4;

public class Numero implements ExpressaoMatematica{

	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return numero;
	}
}
