package chap03.binary.string;

public class Concat {
	public static void main(String[] args) {
		//연결연산자+
		String s = "자바다";//string의 literal 표현 법은 ""안에 넣는것
		String t = "이것이";
		
		String u = s+t;
		
		System.out.println(u);
		
		u = s + 3.14;
		
		System.out.println(u);//다른 타입의 값을 더해도 결과는 string으로 나온다.
		
		u = 3 + 3.14 + s;
		
		System.out.println(u);//+의 경우 연산방향이 좌측부터 우측으로 향하는데 같은 타입의 값들이 있기에 둘이 먼저 연산되고 진행된다.
		
		u = 3 + s + 3.14;
		
		System.out.println(u);
		
	}
}
