package Decorator;

import Decorator.beverage.Beverage;
import Decorator.beverage.DarkRoast;
import Decorator.beverage.Espresso;
import Decorator.beverage.HouseBlend;
import Decorator.beverage.Mocha;
import Decorator.beverage.Soy;
import Decorator.beverage.Whip;

/*
 * ���ڷ����� �����̶� - �־��� ��Ȳ �� �뵵�� ���� � ��ü�� å��(���)�� �������� �߰��ϴ� ����, ���ڷ����ʹ� ����Ŭ������ ����� ���� ���ؼ� ����� �����ϰ� Ȯ���� �� �ִ� ����� ����
 * ��ü���� ��Ģ = OCP(Open-Closed principle) - Ŭ������ Ȯ�忡 ���ؼ��� ���� �־�� ������ �ڵ� ���濡 ���ؼ��� ���� �־�� �Ѵ�.
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
