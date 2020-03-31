package chap03.examples;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 뺴면,");
		System.out.println(result + "조각이 남는다.");
		//부동소수점타입(float, double은 0.1을 정확히 표현 불가.
		//떄문에 근사치로 처리해 오차가 생긴다.
	}
}
