package chap03.binary.compare;

public class Compare {
	public static void main(String[] args) {
		// ==, !=, >, >=, <, <=
		// 8개 primitive type의 실질적으로 가지고 있는 값의 비교가 이루어진다.
		int i = 10;
		int j = 15;
		boolean b = i == j;
		System.out.println(b);
		System.out.println(i != j);
		System.out.println(i > j);
		System.out.println(i >= j);
		System.out.println(i < j);
		System.out.println(i <= j);
		//Javascript와는 다르게 타입까지 비교하는 것은 없다.
		//비교연산자는 Boolean type으로 결과값 도출
		
		//다른 타입끼리 비교될 때
		//큰 타입으로 자동 형변환
		System.out.println('A' == 65);//다른타입이기에 char 타입의 A가 int타입인 65로 변환
		System.out.println(3 == 3.0);//double type으로 변환
		
		System.out.println(0.1 == 0.1f);//부동소수점 타입의 경우
		//서로다른타입의 같은 값이지만 float type 의 0.1f가 double type으로 변경되나 근사치로 변하며 서로 다른값이 될 수 있다.
		
	}
}
