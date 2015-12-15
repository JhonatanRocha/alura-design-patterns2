package br.com.designPattern.cap3;

public class EstadoContrato {

	private Contrato contrato;
	
	public EstadoContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	
	public Contrato getEstadoContrato(){
		return contrato;
	}
}
