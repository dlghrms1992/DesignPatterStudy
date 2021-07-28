package StrategyPattern.duck.children;

import StrategyPattern.duck.parent.Duck;

public class DecoyDuck extends Duck {

	
	
	@Override
	public void display() {
		System.out.println("DeecoyDcuk~!");
	}

	
}

