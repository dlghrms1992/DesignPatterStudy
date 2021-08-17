package Decorator.beverage;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	
	
	public Size getSize() {
		return beverage.getSize();
	}



	public String getDescription() {
		return beverage.getDescription() + ", µŒ¿Ø";
	}
	
	public double cost() {
		double cost = .30 + beverage.cost();
		
		if(getSize() == Size.TALL) {
			cost += 0f;
		}else if(getSize() == Size.BENTY) {
			cost += .20f;
		}else {
			cost += .10f;
		}
		
		return cost;
	}
	
}
