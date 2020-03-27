package chap02.variables;

public class Variables2 {
	public static void main(String[] args) {
		// 변수에 값 저장

		int score;
		score = 90;

		// 값(literal)
		// 정수
		System.out.println(0);
		System.out.println(75);
		System.out.println(-100);

		// 8진법 0으로 시작하는 수
		System.out.println(02);
		System.out.println(055);

		// 16진법 0x로 시작하는 수
		System.out.println(0x5);
		System.out.println(0xA);
		System.out.println(0xB3);

		// window 계산기 programmer용을 사용하면 진법변환이 편하다.
		// HEX16진법 DEC10진법 OCT 8진법 BIN 2진법

		// 실수
		System.out.println(0.25);
		System.out.println(-3.14);

		System.out.println(5E7); // 5*(10의 7승)
		System.out.println(5e7); // 상동

		System.out.println(0.12E-5);// 0.12*(10^-5)
		System.out.println(0.12e-5);// 상동

		// 문자
		System.out.println('A');// 하나의 character는 ''
		System.out.println('a');
		System.out.println('가');
		System.out.println('나');

		//System.out.println('Ab');
		//System.out.println(''); 빈문자열은 하나의 문자가아니므로''사용불가

		System.out.println(' ');
		System.out.println('\t'); // tab
		System.out.println('\n'); // new LInke
		System.out.println('\u0090');
		System.out.println('\u005A');// 문자 코드로도 사용가능

		// 문자열 ""사용
		System.out.println("여러개의 문자");
		System.out.println("");
		System.out.println("탭 \t로 작성");
		System.out.println("뉴라인은 \n으로 작성");

		// 논리(boolean)
		System.out.println(true);
		System.out.println(false);

	}
}
