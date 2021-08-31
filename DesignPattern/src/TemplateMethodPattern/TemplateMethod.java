package TemplateMethodPattern;
/**
 * 템플릿 메소드 패턴 - 메소드에서 알고리즘 골격을 정의한다.
 * 알고리즘의 여러 단계 중 일부는 서부클래스에서 구현 할 수 있다. 
 * 템플릿 메소드를 이용하면 알고리즘의 구조는 그대로 유지하면서 서브클래스에서 특정 단계를 재정의 한다. 
 * @author HGLEE
 *
 */
public class TemplateMethod {
	
	public static void main(String[] args) {
		Tea myTea = new Tea();
		myTea.prepareRecipe();
	}
}
