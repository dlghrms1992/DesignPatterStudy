package Decorator;

import Decorator.beverage.Beverage;
import Decorator.beverage.DarkRoast;
import Decorator.beverage.Espresso;
import Decorator.beverage.HouseBlend;
import Decorator.beverage.Mocha;
import Decorator.beverage.Soy;
import Decorator.beverage.Whip;

/*
 * 데코레이터 패턴이란 - 주어진 상황 및 용도에 따라 어떤 객체에 책임(기능)을 동적으로 추가하는 패턴, 데코레이터는 서브클래스를 만드는 것을 통해서 기능을 유연하게 확장할 수 있는 방법을 제공
 * 객체지향 원칙 = OCP(Open-Closed principle) - 클래스는 확장에 대해서는 열려 있어야 하지만 코드 변경에 대해서는 닫혀 있어야 한다.
 */
public class StarbuzzCoffe {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() +", $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		
		System.out.println(beverage2.getDescription() +", $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		
		System.out.println(beverage3.getDescription() +", $" + beverage3.cost());
	}
}
