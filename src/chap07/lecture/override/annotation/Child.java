package chap07.lecture.override.annotation;

public class Child extends Parent {
 
	@Override
//	void method1(double d) {
	void method1() {
		//method1() overriding
		//compiler에게 점검받는 주석 -> @override annotation
		//바로 다음에 오는 method1개만
	}
	
	void method1(double d) {
		
	}

	@Override
	void method1(int i) {
		// TODO Auto-generated method stub
		super.method1(i);
		//source -> override/implement methods...
	}
	
	
}
