package chap02.exercises;

public class Exercise1 {
	public static void main(String[] args) {
		//1. 답 4
		//int a;
		//System.out.println(a); // a 초기값x 컴파일에러
		
		//2. 답 1, 4, 5
		int modelName;
		//int class; keword x 
		//int 6hour; 숫자시작x
		int $value;
		int _age;
		//int int; keword x
		
		//3.
		/*
		 * 	정수 1byte (byte)	2byte (short, char)	4byte (int)	8byte (long)
		 * 	실수 4byte (float)	8byte (double)
		 * 	논리 1byte (boolean)
		 */
		
		//4.
		int age;
		age = 10;
		double price = 3.14;
		
		/*
		 * 타입 	: int, double
		 * 변수 	: age, price
		 * 리터럴	: 10, 3.14
		 */
		
		//5. 딥 3
		byte byteValue = 10;
		char charValue = 'A';
		//short shortValue = charValue; 양/음수 양수
		
		//6. 답 4
		int intValue = 10;
		char charValue2 = 'A';		//문자 하나
		double doubleValue = 5.7;
		String strValue = "A";		//문자열
	
		double var = (double) intValue;
		byte var2 = (byte) intValue;
		int var3 = (int) doubleValue;
		//char var4 = (char) strValue; 일반적으로는 8가지 type의 primitve type과 
		//나머지 type들의(참조 type) 변환은 이루어지지 않는다.
		
		//7. 답 3 
		int var71 = 10;
		long var72 = 10000000000000L;
		//char var73 = ''; //문자가 아니다.
		double var74 = 10;
		float var75 = 10;
		
		
		//8. 답 1
		byte bytvlaue8 = 10;
		float floatValue8 = 2.5F;
		double doubleValue8 = 2.5;
		//byte result = byteValue8 + byteValues8;
		// byte 사이의 합은 int로 변환된다.
	
	
	}
}
