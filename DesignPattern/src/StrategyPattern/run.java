package StrategyPattern;

import StrategyPattern.behaivor.fly.FlyNoWay;
import StrategyPattern.children.MallardDuck;
import StrategyPattern.parent.Duck;

public class run {
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		
		mallardDuck.performFly();
		mallardDuck.setFlyBehavior(new FlyNoWay());
		mallardDuck.performFly();
		mallardDuck.performQuack();
	
	}

}
