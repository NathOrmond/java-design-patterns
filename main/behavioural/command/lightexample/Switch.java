package behavioural.command.lightexample;

import behavioural.command.generic.ICommand;

/**
 * Switch acts as invoker in command pattern
 * light driver example
 * @author nat
 *
 */
public class Switch {

	private ICommand command;
	
	public Switch(ICommand command) {
		this.command = command;
	}
	
	public void pressSwitch() { 
		command.execute();
	}
	
}
