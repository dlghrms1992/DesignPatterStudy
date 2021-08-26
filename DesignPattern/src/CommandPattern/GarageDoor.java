package CommandPattern;

public class GarageDoor {
	
	Command command;
	public GarageDoor() {};
	
	public void setCommand(Command command) {
		this.command = command;
	};
	
	public void buttonWasPressed() {
		command.execute();
	}
}
