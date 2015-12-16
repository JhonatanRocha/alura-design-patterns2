package br.com.designPatterns.cap8;

public class Programa {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("12345678990");
		EmpresaFacade empresaFacade = new EmpresaFacadeSingleton().getInstance();
		empresaFacade.buscaCliente(cliente.getCpf());
		empresaFacade.gerarFatura(cliente, 150);
	}
}
