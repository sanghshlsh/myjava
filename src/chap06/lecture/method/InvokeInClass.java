package chap06.lecture.method;

public class InvokeInClass {
	void method1() {
		System.out.println("method1 실행");
	}
	
	void method2() {
		method1();	//객체 내부에서 메소드1 호출
		System.out.println("method2 실행");
	}
}
