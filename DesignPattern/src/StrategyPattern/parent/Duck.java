package StrategyPattern.parent;

import StrategyPattern.behaivor.fly.FlyBehavior;
import StrategyPattern.behaivor.quack.QuackBehavior;

/**
 * 
 * @author HGLEE
 * ������ ��Ģ1 - ���ø����̼ǿ��� �޶����� �κ��� ã�Ƴ���, �޶����� �ʴ� �κ����κ��� �и���Ų��.
 * �޶����� �κ��� ã�Ƽ� ������ �ڵ忡 ������ ���� �ʵ��� "ĸ��ȭ" �մϴ�.
 * �׷��� �ڵ带 �����ϴ� �������� �ǵ����� ���� ���� �Ͼ�� ���� ���̸鼭 �ý����� �������� ��� ��ų �� �ִ�. 
 * 
 * ������ ��Ģ2 - ������ �ƴ� �������̽��� ���߼� ���α׷��� �Ѵ�. 
 * �������̽��� ���缭 ���α׷����Ѵ� �� ���� ��� ���� ���Ŀ� ���缭 ���α׷����Ѵٴ� ���� ���Ѵ�. 
 *
 */
public abstract class Duck {

	//proteted �����Ұ�
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void swim() {
		System.out.println("��� ������ ���� ��ϴ�. ��¥ ������ ����");
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
