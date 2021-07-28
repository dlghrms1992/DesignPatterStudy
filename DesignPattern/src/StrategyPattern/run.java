package StrategyPattern;

import StrategyPattern.chess.behaivor.AxeBehaivor;
import StrategyPattern.chess.children.King;
import StrategyPattern.chess.parent.Character;
import StrategyPattern.duck.behaivor.fly.FlyNoWay;
import StrategyPattern.duck.children.MallardDuck;
import StrategyPattern.duck.parent.Duck;

public class run {
	public static void main(String[] args) {
		//1 DUCK
		Duck mallardDuck = new MallardDuck();
		
		mallardDuck.performFly();
		mallardDuck.setFlyBehavior(new FlyNoWay());
		mallardDuck.performFly();
		mallardDuck.performQuack();
	
		//2 character
		Character king = new King();
		
		king.fight();
		king.setWeapone(new AxeBehaivor());
		king.fight();
		
	}

}
