package StrategyPattern.duck.children;

import StrategyPattern.duck.parent.Duck;

public class ReadheadDuck extends Duck {

	@Override
	public void display() {
		System.out.println("빨간머리 오리입니다.");
	}

	
}
