package chap05.reftype;

public class NewOperator {
	public static void main(String[] args) {
		String s = new String("java");
		// String s = "java"; //편의상 java에선 이렇게 사용
		// 연산자 new를 사용하지 않고 이렇게 스트링을 선언한다면 문자열 값이 같다면 같은 객체를 공유한다.

		Object o = new Object();
		// 그림 02. new 연산자
		// new 연산자 작동 형식
		// stack area에 o라는 이름의 변수가 지정되고
		// heap area에 객체가 생성된후 이 객체의 주소가 stack area에 있는 변수 o 에 값으로 할당

		String s2 = new String("java");

	}
}
