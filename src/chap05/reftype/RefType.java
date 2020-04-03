package chap05.reftype;

public class RefType {
	public static void main(String[] args) {
		int a = 25;
		double d = 3.14;
		// 그림 01. 기본타입과 참조타입
		// 기본 타입들은 값을 선언할 때 stack에 해당 타입의 크기를 가지고 변수명과 해당값자체가 저장된다.
		// 참조 타입의 경우는 Heap area에 해당 객체의 속성,메소드등이 저장되고 이 주소가 stack에 변수명과 함꼐 저장된다.

		String s = "java";
		int[] arr = { 1, 2 };

	}
}
