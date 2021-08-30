package TemplateMethodPattern;

public class Tea extends CafeeineBeverage {
	
	@Override
	void brew() {
		System.out.println("차를 우려내는 중");
	}


	@Override
	void addCondiments() {
		System.out.println("레몬 추가하는 중");		
	}

}
