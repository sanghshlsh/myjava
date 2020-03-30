package chap03.unary;

public class BitwiseNot {
	public static void main(String[] args) {
		//0 ↔ 1
		//십진법 10
		//이진법 00..0001010(32bit)
		
		int a = 10;
		int b = ~a;
		//~연산이후
		//이진법 11..1110101(32bit)
		//십진법으로 -11 대칭이다.
		System.out.println(a);
		System.out.println(b);
		
		
		byte b1 = 10;
		//byte b2 = ~b1;
		
		// 정수를 비트(문자열String)로 표현하는 메소드
		String s = Integer.toBinaryString(a);
		System.out.println(s);
		s = Integer.toBinaryString(b);
		System.out.println(s);
		
		
		
	}
	//십진법10을 2진법1010으로 바꿀때 앞에 0을 붙여주는 메소드
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
	
}
