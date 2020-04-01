package codingbat;

public class StringEx1 {
	public static void main(String[] args) {
		// charAt(int index) 해당 index에 해당하는 문자를 return 0시작
		String s1 = "samsung";
		String s2 = "apple";
		char c = s1.charAt(0);
		System.out.println(c);
		System.out.println(s1.charAt(0));
		System.out.println(s2.charAt(0));
		System.out.println(s1.charAt(6));
		// System.out.println(s1.charAt(7));
		// 저장하고 있는 값의 범위를 넘어가 Exception 발생

		// length() integer return
		System.out.println("길이");
		int s1Length = s1.length();
		int s2Length = s2.length();
		System.out.println(s1Length);
		System.out.println(s2Length);

		// substring(int begin, int end) // begin 포함 end 미포함
		String sub1 = s1.substring(1, 3);
		System.out.println(sub1);

		String s3 = "asjdoifjwehfahIUvgbuizsgbflui";
		int s3Length = s3.length();
		String sub2 = s3.substring(s3Length - 2, s3Length);
		System.out.println(sub2);
		// substring(int begin) // begin index부터 끝까지

		// indexOf(String s)
		s1 = "자바스크립트";
		int i = s1.indexOf("스크립트");
		System.out.println(i);
		s1 = "990000-12-34-56-7";
		i = s1.indexOf("-");
		System.out.println(i);

		// lastIndexOf(String s) 뒤에서 부터 찾는다.
		i = s1.lastIndexOf("-");
		System.out.println(i);

		// replace(String old, String new) 여러개면 여러개가 바뀐다. 원본이 바뀌는것은 아니다.
		s1 = "나는 아이폰, 아이폰이 있다.";
		String news1 = s1.replace("아이폰", "갤럭시");
		System.out.println(news1);
		System.out.println(s1);

		// toLowerCase(), toUpperCase() 원본이 바뀌는것은 아니다.
		s1 = "javaSCRIPT";
		String ls1 = s1.toLowerCase();
		System.out.println(ls1);
		System.out.println(s1);

		String us1 = s1.toUpperCase();
		System.out.println(us1);
		System.out.println(s1);

		// equals(String s)
		s1 = "자바";
		s2 = "자바";
		System.out.println(s1.equals(s2));
		s1 = "자바";
		s2 = "JAVA";
		System.out.println(s1.equals(s2));
		s1 = "자바";
		s2 = "자바 ";
		System.out.println(s1.equals(s2));

		// trim(); 빈공간 제거(양끝만) 원본이 바뀌는 것은 아니다.
		s1 = "   자   바   ";
		String ns1 = s1.trim();
		System.out.println(s1);
		System.out.println(ns1);

	}
}
