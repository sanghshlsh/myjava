package chap04.examples;

public class SwitchStringExample {
	public static void main(String[] args) {
		String position = "과장";
		//참조 타입이라면 equals로 비교하게된다 다른객체여도 문자열만 같으면 해당case로 간다.
		//position = null;//null값을 보통 참조하는 객체가 없게 만들때 사용
		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;

		case "과장":
			System.out.println("500만원");
			break;

		default:
			System.out.println("300만원");
			break;
		}
	}
}
