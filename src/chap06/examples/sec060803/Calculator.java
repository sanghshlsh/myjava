package chap06.examples.sec060803;

public class Calculator {
	int field;

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		int field = 0;
		System.out.println(this.field);
		double sum = this.plus(x, y);//int plus method 호출
		double result = sum / 2;
		return result;
	}

	void execute() {
		double result = avg(7, 10);//double avg method호출
		println("실행결과: " + result);	//println method호출
	}

	void println(String message) {
		System.out.println(message);
	}
}
