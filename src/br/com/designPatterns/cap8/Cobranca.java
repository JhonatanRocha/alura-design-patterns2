package br.com.designPatterns.cap8;

public class Cobranca {

	private TipoCobranca boleto;
	private Fatura fatura;

	public Cobranca(TipoCobranca boleto, Fatura fatura) {
		this.boleto = boleto;
		this.fatura = fatura;
	}

	public void emite() {
		
	}
}
