package StrategyPattern.duck;

import StrategyPattern.duck.behaivor.fly.FlyNoWay;
import StrategyPattern.duck.children.MallardDuck;
import StrategyPattern.duck.parent.Duck;

public class run {
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		
		mallardDuck.performFly();
		mallardDuck.setFlyBehavior(new FlyNoWay());
		mallardDuck.performFly();
		mallardDuck.performQuack();
	
	}

}
