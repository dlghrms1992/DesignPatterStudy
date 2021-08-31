package SingltonPattern.chocolate;

public class ChocolateBoiler {
	private static ChocolateBoiler uniqueBoiler;
	private boolean empty;
	private boolean boiled;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		if(uniqueBoiler == null) {
			uniqueBoiler = new ChocolateBoiler();
		}
		return uniqueBoiler;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = true;
			boiled = false;	
		}
	}
	
	
	public void boil() {
		
	}
	
	public void drain() {
		
	}
	
	
	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	public void setBoiled(boolean boiled) {
		this.boiled = boiled;
	}

	public static void main(String[] args) {
//		ChocholateBoiler boiler = ChcolateBoiler.getInstance();
//		boiler.fill();
//		boiler.boil();
//		boiler.drain();
	}
}
