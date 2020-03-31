package chap03.binary.compare;

public class RefType {
	public static void main(String[] args) {
		//참조타입(8개 primitive type을 제외한 나머지) 비교
		String a = "자바";
		String b = "자바";
		
		boolean r = a == b;
		System.out.println(r);
		
		String c = "자";
		String d = "바";
		String e = c + d;
		
		System.out.println(b);
		System.out.println(e);//b와 e는 가지고 있는 값은 같은것으로 보여진다 실제로 character나열도 동일하다
		
		r = b == e;
		System.out.println(r);//
		System.out.println(b.equals(e));//내용이 같은지 확인하는 method
		
		String f = new String("자바");//새로운 객체를 만들어내는 연산자new
		
		System.out.println(e == f);
		System.out.println(e.equals(f));
		
		int aHashcode = System.identityHashCode(a);//참조한 객체의 번지값을 알아보는 method
		int bHashcode = System.identityHashCode(b);
		int eHashcode = System.identityHashCode(e);
		int fHashcode = System.identityHashCode(f);
		
		System.out.println(aHashcode);
		System.out.println(bHashcode);
		System.out.println(eHashcode);
		System.out.println(fHashcode);
		
		System.out.println();
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(e.hashCode());
		System.out.println(f.hashCode());
		
		//cf)	참조타입의 경우는 다들 객체다.
		//ex) 	primitive type 의 경우 int i = 30;이런식으로 정의한다면 i라는 변수의 4byte의 저장공간에 30이라는 값이 저장된다.
		//		참조타입인 String type의 경우는 String a = "자바"라는 식으로 정의를 한다면 "자바"라는 literal을 가진 객체가 어딘가에 저장되고
		//		변수 a에는 그 객체의 번지값을 저장한다.
		//		위를 예시로 들어 만약 a와b에 참조하는 객체의 값이 c에서 참조하는 객체의 값과 동일 하다고 해도
		//		그 객체가 "자" "바" 두 객체를 더한 객체와 같은 객체가 아니여서 b == e는 false가 나온다.
		
	}
}
