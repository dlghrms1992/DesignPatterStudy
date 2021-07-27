package StrategyPattern.duck.children;

import StrategyPattern.duck.behaivor.fly.FlyBehavior;
import StrategyPattern.duck.behaivor.fly.FlyWithWings;
import StrategyPattern.duck.behaivor.quack.Quack;
import StrategyPattern.duck.behaivor.quack.QuackBehavior;
import StrategyPattern.duck.parent.Duck;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();		
	}
	

	@Override
	public void display() {
		System.out.println("저는 물오리입니다.~!");
	}
	 public void setFlyBehavior(FlyBehavior flyBehavior) {
	     this.flyBehavior = flyBehavior;
	 }
	    
	    
	 public void setQuackBehavior(QuackBehavior quackBehavior) {
	     this.quackBehavior = quackBehavior;
	 }

	
}
