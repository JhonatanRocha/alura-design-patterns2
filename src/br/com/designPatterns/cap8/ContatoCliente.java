package br.com.designPatterns.cap8;

public class ContatoCliente {

	private Cliente cliente;
	private Cobranca cobranca;

	public ContatoCliente(Cliente cliente, Cobranca cobranca) {
		this.cliente = cliente;
		this.cobranca = cobranca;
	}

	public void dispara() {
		
	}

}
