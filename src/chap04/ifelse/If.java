package chap04.ifelse;

public class If {
	public static void main(String[] args) {
		// if 조건에 따라 실행할 블럭이 결정됨

		int a = 2;
		if (a > 10)
			System.out.println("실행할까? 말까?");
		// 실행문이 하나일 경우는 중괄호를 생략할 수도 있다.
		System.out.println("실행할까?2");
		// 같은 블럭에서 실행할 statement가 두 줄 이상이라면 중괄호를 생략하면 안된다.

		// if else
		// 조건문이 false일떄 실행될 statement들은 else 블럭에 넣어야 한다.
		if (a > 10) {
			System.out.println("조건이 true일 때 실행");
		} else {
			System.out.println("조건이 false일 때 실행");
		}
		// else 블럭의 중괄호도 한줄이라면 생략가능 하다.
		if (a > 10)
			System.out.println("중괄호 생략 true");
		else
			System.out.println("중괄호 생략 false");

		// else if () : 이전의 if나 else if의 조건이 false 일 때
		// 현재 블럭의 조건을 확인하고 true이면 실행

		a = 100;
		if (a > 90) {
			System.out.println("90보다 큽니다.");
			// if문의 조건을 만족하므로 else if블럭으로 넘어가지 않고 종료
		} else if (a > 80) {
			// 여러개 중첩해서 사용 가능
			System.out.println("80보다 큽니다.");
		} else if (a > 70) {
			System.out.println("70보다 큽니다.");
		} else {
			System.out.println("70미만 입니다.");
		}	//else 와도 혼용 가능

	}
}
