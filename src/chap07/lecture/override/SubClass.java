package chap07.lecture.override;

public class SubClass extends SuperClass {
	//method overriding
	public void method1() {
		System.out.println("서브클래스의 메소드1");
	}
	
	//method overriding(x) method overloading
	public void method1(int i ) {
		System.out.println("서브클래스의 메소드2");
	}
}
