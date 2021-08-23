package FactoryPattern.pizza;
//서브클래스 지역마다 다른 피자스타일을 구현하기 위해서
public class NYPizzaStore extends PizzaStore{

	
	
	public NYPizzaStore(SimplePizzaFactory factory) {
		super(factory);
	}

	@Override
	public Pizza orderPizza(String type) {
		return super.orderPizza(type);
	}

	@Override
	Pizza createPizza(String type) {
		Pizza pizza;
		if(type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		}
		return null;
	}

	
}
