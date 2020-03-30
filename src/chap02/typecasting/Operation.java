package chap02.typecasting;

public class Operation {
	public static void main(String[] args) {
		//+ - * / %
		//피연산자의 타입이 다를 경우
		//큰 타입으로 변환
		//{byte, short, char, int}는 모두 int 타입으로 계산
		
		int i = 3; 
		long l = 10;
		
		//i + l;
		// i 는 묵시적으로 long타입으로 변환된 후 계산된다.
		//따라서 int i2 = i + l;안된다.
		long l2 = i + l;
		
		byte b1 = 2;
		byte b2 = 3;
		
		//byte b3 = b1 + b2;
		//정수의 연산은 모두 int로 계산된다,
		int i3 = b1 + b2;
		
		char c1 = 'A';
		char c2 = 'B';
		
		//char c3 = c1 + c2;
		int i4 = c1 + c2;
		
		float f1 = 3.14F;
		float f2 = 2.21F;
		
		float f3 = f1 + f2;
		
		//f3 = f1 + 3.14;
		double d1 = f1 + 3.14;
		
				
	}
}
