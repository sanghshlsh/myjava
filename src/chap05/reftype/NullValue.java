package chap05.reftype;

public class NullValue {
	public static void main(String[] args) {
		// 그림 04.
		String s1;
		s1 = null;
		// null값은 stack area에 주소값 대신 null 이 저장된다.(참조하는 객체가 없다)

		String s2 = "java";
		s2 = null;

		System.out.println(s2 == null);
		System.out.println(s2 != null);

		if (s2 != null) {
			System.out.println(s2.length());
		}

		if (s1 != null) {
			System.out.println(s1.length());
		}

	}
}
