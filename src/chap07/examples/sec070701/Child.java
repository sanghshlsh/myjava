package chap07.examples.sec070701;

public class Child extends Parent {
	
	@Override
	public void method2() {
		System.out.println("child-method2");
	}

	public void method3() {
		System.out.println("Child-method3()");
	}
}
//method1()(상속) method2(overriding),3