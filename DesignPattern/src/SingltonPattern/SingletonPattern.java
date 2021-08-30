package SingltonPattern;

/*
 * �̱��� ���� - �ν��Ͻ��� �ϳ� ���� Ư���� ��ü�� ���� �� �ְ� ���ִ� ����
 * -> �̱��� ������ �ش� Ŭ������ �ν��Ͻ��� �ϳ��� ���������, ��𼭵��� �� �ν��Ͻ��� ������ �� �ֵ��� �ϱ����� ����. 
 * 
 * ��ü�� �� ���� ���� �ʴ´ٸ� ���� �ڿ��� ��ƸԴ� �ƹ����� �� �� ���� ��ü -> �̱��� ������ ���� �ʿ��� ��ü�� ���� �� �� �ִ�. 
 */
public class SingletonPattern {
//	private static SingletonPattern uniqueInstance;
//	
//	private SingletonPattern() {}
//	//��� 1
//	// getInstance�� ����ȭ�� ���Ѽ� ��Ƽ�������� ���õ� ������ �ذ��Ѵ�.
//	// synchronized Ű���常 �߰��ؼ� �� �����尡 �޼ҵ� ����� ������ ������ 
//	// �ٸ� ������� ��ٷ��� �Ѵ�. 
//	public static synchronized SingletonPattern getInstance() {
//		if(uniqueInstance == null) {
//			uniqueInstance = new SingletonPattern();
//		}
//		
//		return uniqueInstance;
//	}
//	
//	//���2
//	// ó������  jvm��  �ν��͸� �����ϸ� �����带 �ᵵ ���� ���� 
//	private static SingletonPattern uniqueInstance = new SingletonPattern(); 
//	
//	public static SingletonPattern getInstance() {
//		return uniqueInstance; //
//	}
	
	//���3
	/*
	 * DCL(Double-Checking Locking)�� �Ἥ 
	 * getInstance()���� ����ȸ �Ǵ� ���� ���δ�.
	 * -> �μ��Ͻ��� �����Ǿ� �ִ��� Ȯ���� ����, �����Ǿ� ���� �ʾ��� ���� ����ȭ�� �� �� �ִ�.
	 * �̷��� �ϸ� ó������ ����ȭ�� �ϰ� ���߿��� ����ȭ�� ���� �ʾƵ� �� ����
	 * private volatile static  SingletonPattern uniqueInstance;
	 */
	
}
