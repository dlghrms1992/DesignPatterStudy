package StrategyPattern.duck.parent;

import StrategyPattern.duck.behaivor.fly.FlyBehavior;
import StrategyPattern.duck.behaivor.quack.QuackBehavior;

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
 * 상위 형식에 마줘서 프로그래밍을함으로써 다형성을 활용해야 한다는 것 
 * 
 * A는 B이다 보다 A에는 B가 있다가 나을 수 있다. 두 클래스를 합치는 것을 구성을 이용하는 것이라고 부름
 * 
 * 디자인 원칙3 - 상속보다는 구성을 활용한다.
 * 
 * 스트래티지 패턴(Stratege Pattern)에스는 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다.
 * 스트래티지을 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.
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
