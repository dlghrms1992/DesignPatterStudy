package StrategyPattern.duck.behaivor.quack;

public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Ва~!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
