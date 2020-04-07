package chap06.lecture.staticKeyword;

public class MyClass {
	static int j;// 모든 인스턴스가 공통으로 가지고 있는 필드 static field, class field
	int i; // instance field


	//스태틱블럭
	static {
		j = 98765;
	}
	
	
	MyClass(){
		//인스턴스를 초기화 하는 코드를 작성
	}
	
	
	
	
	
	
	
	
	
	
	
	
	void method() {
		System.out.println("인스턴스 메소드");
	}
	//간단하게 만들 수 있는 멤버 int i void method 

	// static method, class method
	static void method2() {
		//System.out.println(i);//static 멤버에서는 instance 멤버에 접근 할 수 없다.
		System.out.println("스태틱 메소드");
		//System.out.println(this.i);
		//System.out.println(this.j);
		// static member에서는 this keyword를 사용 할 수 없다.
	}

	// member = field + method
	// 기존 사용하던 것들은 instance method
	// static field와 static method를 합쳐 static method라 부름

}
