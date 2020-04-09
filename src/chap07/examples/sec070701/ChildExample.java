package chap07.examples.sec070701;

public class ChildExample {
	public static void main(String[] args) {
		// 그림11. 다향성 예제
		Child child = new Child();

		Parent parent = child; // 자동타입변환
		parent.method1();
		parent.method2(); // 재정의된 메소드 호출(override method)
		// parent.method3(); //호출 불가

	
	}
}

//Parent class 	->	method1,2
//Child class 	->	method2(overriding),3

//Child child =  new child();
//stack영역 child 값으로 주소할당ex)989
//heap영역 method1() method(overriding)2() method3() 생성

//Parent parent =child	
//stack 영역 parent 값으로 child주소989할당


//Parent parent = new Child();