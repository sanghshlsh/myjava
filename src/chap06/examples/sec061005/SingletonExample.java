package chap06.examples.sec061005;

public class SingletonExample {

	public static void main(String[] args) {

		/*
		  Singleton obj4 = new Singleton(); //컴파일 에러 (생성자에 private가 붙어서)
		  Singleton obj5 = new Singleton(); //컴파일 에러
		 */
//		Singleton obj3 = Singleton.singleton()//static type이어서 클래스명으로 사용가능 하지만 private때문에 컴파일 에러
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다");
		} else {
			System.out.println("다른 Singleton 객체 입니다");
		}
	}
}