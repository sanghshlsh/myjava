package chap06.lecture.myclass;

public class MyApp {
	public static void main(String[] args) {
		MyClass c1;//우리가 만들 객체 heap 영역에 아직 생성되지 않았다.
		c1 = new MyClass();//heap 영역에 생성
		
		
		
		//System.out.println(c1.); // c1의 기능을 사용하자면 c1 . 00000 //00에 넣어야 한다.
		//System.out.println(c1.field1);
		//System.out.println(c1.method1());
		MyClass c2 = new MyClass();
		//type  참조변수   instance
		//instance가 new 할당연산자에 의해 c2참조변수에 들어가고 type은 MyClass
		System.out.println(c1==c2);
		
	}
}
