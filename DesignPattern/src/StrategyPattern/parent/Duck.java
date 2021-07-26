package StrategyPattern.parent;

import StrategyPattern.behaivor.fly.FlyBehavior;
import StrategyPattern.behaivor.quack.QuackBehavior;

/**
 * 
 * @author HGLEE
 * 디자인 원칙1 - 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분으로부터 분리시킨다.
 * 달라지는 부분을 찾아서 나머지 코드에 영향을 주지 않도록 "캡슐화" 합니다.
 * 그러면 코드를 변경하는 과정에서 의도하지 않은 일이 일어나는 것을 줄이면서 시스템의 유연성은 향상 시킬 수 있다. 
 * 
 * 디자인 원칙2 - 구현이 아닌 인터페이스에 맞추서 프로그래밍 한다. 
 * 인터페이스에 맞춰서 프로그래밍한다 는 것은 사실 상위 형식에 맞춰서 프로그래밍한다는 것을 뜻한다. 
 *
 */
public abstract class Duck {

	//proteted 공부할것
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void swim() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
	}
	
	public void dispaly() {
		
	}

	public void performQuack() {
		this.quackBehavior.quack();
	}
	
	public void performFly() {
		this.flyBehavior.fly();
	}
	
	 public void setFlyBehavior(FlyBehavior flyBehavior) {
	     this.flyBehavior = flyBehavior;
	 }
	    
	    
	 public void setQuackBehavior(QuackBehavior quackBehavior) {
	     this.quackBehavior = quackBehavior;
	 }
}
