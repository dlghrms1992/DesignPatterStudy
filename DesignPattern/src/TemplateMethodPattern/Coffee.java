package TemplateMethodPattern;

public class Coffee extends CafeeineBeverage {
	
	@Override
	void brew() {
		System.out.println("���͸� ���ؼ� Ŀ�Ǹ� ������� ��");
	}


	@Override
	void addCondiments() {
		System.out.println("������ ���� �߰��ϴ� ��");		
	}

	
}
