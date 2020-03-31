package chap03.examples;

public class InputDataCheckNanExample1 {
	public static void main(String[] args) {
		String userInput = "NaN"; //사용자로부터 입력 받은 값
		double val = Double.valueOf(userInput); //입력받은 값을 double타입으로 변환
		
		double currentBalance = 10000.0;
		
		currentBalance += val;	//currentBalance에 NaN저장
		System.out.println(currentBalance);
	}
}
