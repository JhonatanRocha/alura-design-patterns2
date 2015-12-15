package br.com.designPatterns.cap3;

import java.util.Calendar;

public class Contrato {

	private Calendar data;
	private String cliente;
	private TipoContrato tipoContrato;
	
	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public Contrato(Calendar data, String cliente, TipoContrato tipoContrato) {
		this.data = data;
		this.cliente = cliente;
		this.tipoContrato = tipoContrato;
	}
	
	public void avanca(){
		if(tipoContrato == TipoContrato.NOVO)
			setTipoContrato(TipoContrato.EM_ANDAMENTO);
		else if(tipoContrato == TipoContrato.EM_ANDAMENTO)
			setTipoContrato(TipoContrato.ACERTADO);
		else if(tipoContrato == TipoContrato.ACERTADO)
			setTipoContrato(TipoContrato.CONCLUIDO);
	}
	
	public EstadoContrato salvaEstado(){
		return new EstadoContrato(new Contrato(this.data, this.cliente, this.tipoContrato));
	}
	
	public void restaura(EstadoContrato estadoContrato) {
        this.data = estadoContrato.getEstadoContrato().getData();
        this.cliente = estadoContrato.getEstadoContrato().getCliente();
        this.tipoContrato = estadoContrato.getEstadoContrato().getTipoContrato();
    }
}
