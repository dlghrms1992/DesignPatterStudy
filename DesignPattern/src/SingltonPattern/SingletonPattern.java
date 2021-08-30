package SingltonPattern;

/*
 * 싱글톤 패턴 - 인스턴스가 하나 뿐인 특별한 객체를 만들 수 있게 해주는 패턴
 * -> 싱글턴 패턴은 해당 클래스의 인스턴스가 하나만 만들어지고, 어디서든지 그 인스턴스에 접근할 수 있도록 하기위한 패턴. 
 * 
 * 객체를 한 번도 쓰지 않는다면 괜히 자원만 잡아먹는 아무데도 쓸 데 없는 객체 -> 싱글톤 패턴을 쓰면 필요한 객체를 만들 수 가 있다. 
 */
public class SingletonPattern {
//	private static SingletonPattern uniqueInstance;
//	
//	private SingletonPattern() {}
//	//방법 1
//	// getInstance를 동기화를 시켜서 멀티스레딩과 관련된 문제를 해결한다.
//	// synchronized 키워드만 추가해서 한 스레드가 메소드 사용을 끝내기 전까지 
//	// 다른 스레드는 기다려야 한다. 
//	public static synchronized SingletonPattern getInstance() {
//		if(uniqueInstance == null) {
//			uniqueInstance = new SingletonPattern();
//		}
//		
//		return uniqueInstance;
//	}
//	
//	//방법2
//	// 처음부터  jvm에  인스터를 생성하면 스레드를 써도 문제 없음 
//	private static SingletonPattern uniqueInstance = new SingletonPattern(); 
//	
//	public static SingletonPattern getInstance() {
//		return uniqueInstance; //
//	}
	
	//방법3
	/*
	 * DCL(Double-Checking Locking)을 써서 
	 * getInstance()에서 동기회 되는 분을 줄인다.
	 * -> 인서턴스가 생성되어 있는지 확인한 다음, 생성되어 있지 않았을 때만 동기화를 할 수 있다.
	 * 이렇게 하면 처음에만 동기화를 하고 나중에는 동기화를 하지 않아도 발 생성
	 * private volatile static  SingletonPattern uniqueInstance;
	 */
	
}
