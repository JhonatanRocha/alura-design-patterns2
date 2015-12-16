package br.com.designPatterns.cap7;

public class PayOrder implements Command {

	private Order order;
	
	public PayOrder(Order order) {
		this.order = order;
	}

	@Override
	public void execute() {
		System.out.println("Pagando o pedido do cliente: " + order.getCliente());
		order.pay();
	}
}
