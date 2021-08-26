package CommandPattern;

public class Test {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();

		LightOncommand lightOn = new LightOncommand(light);
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garage = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(garage);
		remote.setCommand(lightOn);
		remote.buttonWasPressd();
	}

}
