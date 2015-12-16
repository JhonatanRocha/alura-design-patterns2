package br.com.designPatterns.cap8;

public class EmpresaFacade {

	protected EmpresaFacade(){
		
	}
	
	public Cliente buscaCliente(String cpf) {
		Cliente cliente = new ClienteDAO().buscaCpf(cpf);
		return cliente;
	}

	public Fatura gerarFatura(Cliente cliente, double valor) {
		Fatura fatura = new Fatura(cliente, valor);
		return fatura;
	}
	
	public Cobranca geraCobranca(Fatura fatura) {
		Cobranca cobranca = new Cobranca(TipoCobranca.BOLETO, fatura);
		cobranca.emite();
		
		return cobranca;
	}
	
	public ContatoCliente fazContato(Cliente cliente, Cobranca cobranca){
		ContatoCliente contato = new ContatoCliente(cliente, cobranca);
		contato.dispara();
		
		return contato;
	}
}
