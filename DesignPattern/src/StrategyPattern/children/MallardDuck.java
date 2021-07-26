package StrategyPattern.children;

import StrategyPattern.behaivor.fly.FlyBehavior;
import StrategyPattern.behaivor.fly.FlyWithWings;
import StrategyPattern.behaivor.quack.Quack;
import StrategyPattern.behaivor.quack.QuackBehavior;
import StrategyPattern.parent.Duck;

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
