package CommandPattern;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garagedoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garagedoor = garagedoor;
	}
	public void execute() {
		
	};
	
}
