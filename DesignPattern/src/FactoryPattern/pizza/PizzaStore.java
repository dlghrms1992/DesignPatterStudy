package FactoryPattern.pizza;

//�߻�Ŭ������ �ϴ� ������ �� ������ ��Ÿ�Ͽ� �°� �����ο����� �ٲٷ��� �Ѵ�
//������ ���� ����Ŭ���� �ʿ� 
public abstract class PizzaStore {
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = factory.createPizza(type);
		return pizza;
	}
	
	abstract Pizza createPizza(String type);

}
