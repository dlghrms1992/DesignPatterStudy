package Decorator.beverage;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", ÈÖÇÎ";
	}
	
	public double cost() {
		return .30 + beverage.cost();
	}
}
