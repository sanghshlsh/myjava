package chap03.examples;

public class InputDataCheckNaNExample2 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {//NaN검사 //NaN일경우 실행되는 코드
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		currentBalance += val; //currentBalance의 원래 값이 유지
		System.out.println(currentBalance);
		
		
	}
}
