package StrategyPattern.behaivor.quack;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("저는 말을 못해요~!!!!!!!!!!!!!!!!!!!");
	}
}
