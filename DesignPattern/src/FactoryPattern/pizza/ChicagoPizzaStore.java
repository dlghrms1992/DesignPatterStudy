package FactoryPattern.pizza;
// ����Ŭ���� �������� �ٸ� ���ڽ�Ÿ���� �����ϱ� ���ؼ�
public class ChicagoPizzaStore extends PizzaStore {

	
	
	public ChicagoPizzaStore(SimplePizzaFactory factory) {
		super(factory);
	}

	@Override
	public Pizza orderPizza(String type) {
		return super.orderPizza(type);
	}

	@Override
	Pizza createPizza(String type) {
		return null;
	}

	
	
}
