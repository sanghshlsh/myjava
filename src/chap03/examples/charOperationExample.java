package chap03.examples;

public class charOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;	// 문자 A + 1 문자 A는 65의 유니코드값을 가지고있기에 66이나오는데 이는 B에해당//리터럴간 연산은 타입변환없이 해당타입으로 연산
		char c2 = 'A';
		//char c3 = c2 + 1; //컴파일 에러// c2 +1은 c2가 int타입으로 변하고 연산 후 int타입으로 결과값이 나오기에 c1과는 다른상황//변수+리터럴의 연산은 리터럴+리터럴의 연산과는 다르다.
		//char c3 = c2 + 1 을 c1과 같이 하고 싶다면 캐스팅을 이용해야 한다. char c3 = (char) (c2 + 1)
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		//System.out.println("c3: "+c3);
		
	}
}
