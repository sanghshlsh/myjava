package chap06.lecture.method.returntype;

public class MyClass {

	
	//리턴타입: 리턴하는 값의 타입
	void method1() {
		//return 키워드
		//1.메소드를 종료하고 
		//2.오른쪽에 작성된 값을 호출한 곳으로 반환(return)
		//자바에는 값의 타입(ex- double,int,char,String.....)이있다.
		//리턴하는 값이 타입에 맞게 위의 void칸에 들어가야 한다.
		//리턴을 안한다면 void가 들어가야 한다.
		//void타입이어도 return 타입을 쓸 수 있는데 이는 리턴값을 위한것이 아니라 메소드 종료를 위한것이다.
		
		
		return;
	} 
	
	
	void method2(int i) {
		if(i%2==0) {
			System.out.println("메소드를 종료합니다.");
			return;
		}
		System.out.println(i*i);
	}
	
	
	int method3() {
		
		return 3;
	}
	
	
	
	long method4(int a) {
		return a*a;
	}
}
