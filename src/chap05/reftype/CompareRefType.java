package chap05.reftype;

public class CompareRefType {
	public static void main(String[] args) {
		// 그림 03. 참조타입비교

		String s1 = new String("web");
		String s2 = new String("java");
		String s3 = new String("java");

		boolean b1 = s1 == s2;
		System.out.println(b1);// 속성값 주소값 모두 다른 경우

		b1 = s2 == s3;
		System.out.println(b1);// 속성값은 같지만 주소값은 다른경우

		s2 = s3;
		// s2에 s3의 주소를 넣음
		// 아무도 참조하지 않게된 객체인 구s2객체는 시간이 지나면 사라진다.

		b1 = s2 == s3;
		System.out.println(b1);// 주소값이 같아진 경우

		// 참조 타입의 비교는 주소값의 비교이다
	}
}
