package br.com.designPatterns.cap7;

public class OrderTest {
	
	public static void main(String[] args) {
		
		Order order1 = new Order("Jhonatan", 150d);
		Order order2 = new Order("Lais", 450d);
		Order order3 = new Order("Ellie", 857d);
		
		WorkQueue workQueue = new WorkQueue();
		workQueue.add(new PayOrder(order1));
		workQueue.add(new PayOrder(order2));
		workQueue.add(new PayOrder(order3));
		workQueue.add(new FinishOrder(order1));
		workQueue.add(new FinishOrder(order2));
		workQueue.add(new FinishOrder(order3));
		
		workQueue.process();
	}
}
