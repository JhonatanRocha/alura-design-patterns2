package br.com.designPatterns.cap8;

/*
 * Implemente um Singleton para a classe Servico. 
 * A classe Servico pode ser vazia.
 */

public class ServicoSingleton {
	
	private static Servico servicoInstance;
	
	public Servico getInstance() {
		if(servicoInstance == null){
			servicoInstance = new Servico();
		}
		return servicoInstance;
	}
}
