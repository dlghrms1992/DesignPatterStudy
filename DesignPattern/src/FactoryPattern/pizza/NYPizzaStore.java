package FactoryPattern.pizza;
//����Ŭ���� �������� �ٸ� ���ڽ�Ÿ���� �����ϱ� ���ؼ�
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
