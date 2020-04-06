package chap06.lecture.method.parameter;

public class Method2App {
	public static void main(String[] args) {
		Method2 m1 = new Method2();
		m1.method1();
		//m1.method2(); 파라미터가 정의된 method를 사용하려면 파라미터에 정의된 타입과 일치하는 파라미터를 넣어야 한다.
		//m1.method2(3.14);
		m1.method2(3);
		
		m1.triple(9);
		m1.plus(1, 2);
		//넣어준 값 ex)1,2,9,3 인자,argument
		m1.triple2(3.14);
		m1.triple2(3);
		//매개변수가 double타입인데도 int를 넣어도 문제 없는 이유는 자동 형변환 묵시적변환때문
		
		
		m1.max(1,2,3,4,5,6,7,8);
		m1.max(new int[] {6,7,8,9,10,11});
	}
}
