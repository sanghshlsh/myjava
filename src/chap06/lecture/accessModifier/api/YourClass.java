package chap06.lecture.accessModifier.api;

public class YourClass {
	MyClass m = new MyClass(); //MyClass에는 public이 없지만 같은 패키지 내부에 있는 YourClass에서는 사용 가능
	
	public int i ;
	int j;
	private int k;
	
	void method() {
		this.i = 3;
		j = 4;
		k = 4;
	}
}
