package chap06.examples.sec061002;

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10*10*Calculator.pi;//class이름을 사용하여 static filed에 접근
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10,5);//class이름을 사용하여 static method에 접근
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
	}
}
