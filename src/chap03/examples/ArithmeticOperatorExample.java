package chap03.examples;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1="+result1);
		
		int result2 = v1 - v2;
		System.out.println("result2="+result2);
		
		int result3 = v1 * v2;
		System.out.println("result3="+result3);
		
		int result4 = v1 / v2;
		System.out.println("result4="+result4);
		
		int result5 = v1 % v2;
		System.out.println("result5="+result5);
		
		double result6 = (double) v1 / v2;//int type 2개중 하나에 double 타입을 넣어 연산값이 double이나오게 함
		System.out.println("result6="+result6);
	}
}
