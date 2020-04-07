package chap06.examples.sec061005;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}//private → 클래스 안에서만 접근이 가능하다는 키워드
	
	static Singleton getInstance() {
		return singleton;
	}
}
