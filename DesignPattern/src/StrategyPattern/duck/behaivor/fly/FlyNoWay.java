package StrategyPattern.duck.behaivor.fly;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("저는 날개가 없어요~!");
	}
}
