package TemplateMethodPattern;

public class Tea extends CafeeineBeverage {
	
	@Override
	void brew() {
		System.out.println("���� ������� ��");
	}


	@Override
	void addCondiments() {
		System.out.println("���� �߰��ϴ� ��");		
	}

}
