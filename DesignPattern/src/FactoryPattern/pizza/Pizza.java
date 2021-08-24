package FactoryPattern.pizza;

public abstract class Pizza {
	String type;
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		return pizza;
	}
	
	abstract void prepare();

}
