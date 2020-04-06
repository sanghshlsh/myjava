package chap06.lecture.method.parameter;

public class Method2 {

	
	void method1() {
		//파라미터 없음
		System.out.println("파라미터 없는 메소드");
	}
	
	void method2(int i) {
		//파라미터가 int 하나
		System.out.println("파라미터가 int 하나");
	}
	
	void triple(int i) {
		System.out.println((i*3));
	}
	
	void plus(int i, int j) {
		System.out.println(i + j);
		//i,j 매개변수,parameter
		//parameter는 지역변수 처럼 사용된다.
	}
	
	void triple2(double d) {
		System.out.println(d*3.0);
	}
	
	void max(int... n) {
		//몇개 받을지 모를때 ... 사용하면 여러개를 받을 수 있다. array타입
		for(int i = 0; i<n.length;i++) {
		System.out.println(n[i]);	
		}		
	}
	
	//void max2(int ...n, boolean b) { //x
	void max2(double d, int ...n) {//o
	//void max2(byte b, int ...n, boolean b) {//xx
		
		//...이 붙은 값은 항상 마지막에 들어가야한다.
		
	}
	
		
}
