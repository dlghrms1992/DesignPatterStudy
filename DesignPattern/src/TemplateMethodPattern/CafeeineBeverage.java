package TemplateMethodPattern;

public abstract class CafeeineBeverage {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	 void boilWater() {
		 System.out.println("물 끓이는 중");
	 };
	 
	abstract void brew();
	
	abstract void addCondiments();
	
	void pourInCup() {
		System.out.println("컵에 따르는중");
	}

}
