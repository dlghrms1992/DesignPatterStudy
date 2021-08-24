package FactoryPattern.pizza;

public class NYStyleCheesePizza extends Pizza {

	@Override
	public Pizza createPizza(String type) {
		return super.createPizza(type);
	}

	@Override
	void prepare() {
		
	}

}
