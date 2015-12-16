package br.com.designPatterns.cap7;

public class FinishOrder implements Command {

	private Order order;
	
	public FinishOrder(Order order) {
		this.order = order;
	}

	@Override
	public void execute() {
		System.out.println("Finalizando o pedido do cliente: " + order.getCliente());
		order.finish();
	}
}
