package StrategyPattern.children;

import StrategyPattern.parent.Duck;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("저는 고무로된 오리입니다.");
		
	}

	
}
