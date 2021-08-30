package TemplateMethodPattern;

public class Coffee extends CafeeineBeverage {
	
	@Override
	void brew() {
		System.out.println("필터를 통해서 커피를 우려내는 중");
	}


	@Override
	void addCondiments() {
		System.out.println("우유와 설탕 추가하는 중");		
	}

	
}
