package chap06.lecture.returntype;

public class MyClassApp {
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		c1.method2(3);
		c1.method2(2);
		c1.method3();//3을 리턴받았지만 이 3을 사용하지 않아 아무일도 일어나지 않았다.
		
		int c = c1.method3();
		System.out.println(c);
		System.out.println(c1.method3());
		
		long d = c1.method4(9); // 변수에 할당해 사용하고 싶다면 적절한 타입으로 변수를 설정해야 한다.
		System.out.println(d);
		System.out.println(c1.method4(5));
		
		
	
	}
}
