package br.com.designPatterns.cap3;

import java.util.Calendar;

public class ContratoTest {
	public static void main(String[] args) {
		
		HistoricoContrato historicoContrato = new HistoricoContrato();
		Contrato contrato1 = new Contrato(Calendar.getInstance(), "Jhonatan Rocha", TipoContrato.NOVO);
		
		historicoContrato.adiciona(contrato1.salvaEstado());
		System.out.println("Tipo do Contrato " + contrato1.getTipoContrato());
		
		System.out.println("Avançando andamento do contrato...");
		contrato1.avanca();
		System.out.println("Tipo do Contrato " + contrato1.getTipoContrato());
		historicoContrato.adiciona(contrato1.salvaEstado());
		
		System.out.println("Avançando andamento do contrato...");
		contrato1.avanca();
		System.out.println("Tipo do Contrato " + contrato1.getTipoContrato());
		historicoContrato.adiciona(contrato1.salvaEstado());
		
		int index = 1;
		EstadoContrato estadoContratoAnterior = historicoContrato.getEstadoContrato(index);
		System.out.println("Estado anterior " + estadoContratoAnterior.getEstadoContrato().getTipoContrato());
	}
}
