package FactoryPattern.pizza;

//추상클래스를 하는 이유는 각 고유의 스타일에 맞게 구현부에가서 바꾸려고 한다
//분점을 위한 서브클래스 필요 
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
