package chap07.lecture.superKeyword;

public class Child extends Parent {
	public int j;
	
	
	
	@Override
	public void method() {
		super.method();
		System.out.println("재정의된 자식 클래스 메소드");
	}

	public void method2(){
		System.out.println("자식 클래스 메소드2");
		System.out.println(this.i);
		this.method3();
		System.out.println(super.i);
		super.method();//부모클래스를 지칭하는 키워드 super
		
	}
	
	public void method3() {
		
	}
	
	
}
