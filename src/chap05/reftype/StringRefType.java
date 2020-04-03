package chap05.reftype;

public class StringRefType {
	public static void main(String[] args) {
		// 그림 05. String

		String a = new String("java");
		String b = new String("java");

		System.out.println(a == b);

		System.out.println(a.equals(b));

		String c = "java";

		System.out.println(a == c);
		System.out.println(b == c);
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));

		String d = "java";
		// new 연산자를 안쓰고 만든 두 String은 서로 같은 객체를 참조한다.
		System.out.println(c == d);
		System.out.println(c.equals(d));
	}
}
