package CommandPattern;

public class LightOncommand implements Command{
	
	Light light;

	public LightOncommand(Light light) {
		this.light = light;
		
	}
	
	public void excute() {
		light.on();
	}
}
