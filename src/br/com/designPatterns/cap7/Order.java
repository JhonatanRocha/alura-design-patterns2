package br.com.designPatterns.cap7;

import java.util.Calendar;

public class Order {

	private String cliente;
	private double valor;
	private Status status;
	private Calendar dataOrder;
	private Calendar dataFinalizacao;
	
	public Order(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.status = Status.NOVO;
		this.dataOrder = Calendar.getInstance();
	}
	
	public String getCliente() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public Status getStatus() {
		return status;
	}

	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}

	public Calendar getDataOrder() {
		return dataOrder;
	}

	public void pay() {
		status = Status.PAGO;
	}
	
	public void finish() {
		dataFinalizacao = Calendar.getInstance();
		status = Status.ENTREGUE;
	}
}