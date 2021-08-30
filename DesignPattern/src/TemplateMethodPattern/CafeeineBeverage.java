package TemplateMethodPattern;

public abstract class CafeeineBeverage {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	 void boilWater() {
		 System.out.println("�� ���̴� ��");
	 };
	 
	abstract void brew();
	
	abstract void addCondiments();
	
	void pourInCup() {
		System.out.println("�ſ� ��������");
	}

}
