package TemplateMethodPattern;
/**
 * ���ø� �޼ҵ� ���� - �޼ҵ忡�� �˰��� ����� �����Ѵ�.
 * �˰����� ���� �ܰ� �� �Ϻδ� ����Ŭ�������� ���� �� �� �ִ�. 
 * ���ø� �޼ҵ带 �̿��ϸ� �˰����� ������ �״�� �����ϸ鼭 ����Ŭ�������� Ư�� �ܰ踦 ������ �Ѵ�. 
 * @author HGLEE
 *
 */
public class TemplateMethod {
	
	public static void main(String[] args) {
		Tea myTea = new Tea();
		myTea.prepareRecipe();
	}
}
