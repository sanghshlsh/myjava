package chap03.binary.arithmetic;

public class Arithmetic {
	public static void main(String[] args) {
		// + - * / %
		//(byte short char int)모두 결과 int
		//두 항의 타입이 다를 경우 큰 타입으로 결과가 나온다.
		
		int i1 = 10;
		int i2 = 20;
		int i3 = i1 + i2;
		int i4 = i1 - i2;
		int i5 = i1 * i2;
		int i6 = i1 / i2; // 0  int type이므로 소수점버림
		int i7 = i1 % i2; // 10
		
		byte b1 = 10;
		byte b2 = 20;
		//byte b3 = b1 + b2; //결과가 int 강제적 변환을 통하지 않는다면 불가
		
		int i8 = 30;
		long l1 = 100000;
		long i9 = i8 + l1;
		
		long l2 = 20000000;
		float f1 = 3.14F;
		float l3 = l2 + f1;
		
		float f2 = 3.14F;
		double d1 = 2.22;
		
		double f3 = f2 + d1;
		
		char c1 = 'A';
		char c2 = (char) (c1 + 1);//캐스팅을 하지 않는다면 c1이 int타입으로 변경되어 연산되기에 도출되는 값도 int 타입으로 컴파일 에러가 발생
		
		
	}
}
