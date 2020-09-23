package behavioural.command.lightexample;

import behavioural.command.generic.ICommand;

public class LightCommand implements ICommand {

	private Light receiver;
	
	public LightCommand(Light receiver) {
		this.receiver = receiver;
	}
	
	public void execute() {
		receiver.on();
	}

	public void unExecute() {
		receiver.off();
	}

}
