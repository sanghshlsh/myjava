package chap06.lecture.finalKeyword;

public class Constant {
	static final int i = 3;
	static final double PI = 3.141592;
	final static double E = 2.71;//final과 static은 순서가 바뀌어도 상관 없다.
	//상수이름은 대문자로 선언하는것이 관례이다. //CamelCase x
	
	
	void method() {
		int i = Integer.MAX_VALUE;//integer class의 static field인 MAX_VALUE와 MIN_VALUE
		int j = Integer.MIN_VALUE;
	}
}
