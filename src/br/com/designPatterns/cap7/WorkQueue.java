package br.com.designPatterns.cap7;

import java.util.ArrayList;
import java.util.List;

public class WorkQueue {
	
	private List<Command> orderCommands;
	
	public WorkQueue (){
		orderCommands = new ArrayList<Command>();
	}
	
	public void add(Command command){
		this.orderCommands.add(command);
	}
	
	public void process() {
		for (Command command : orderCommands) {
			command.execute();
		}
	}
}
