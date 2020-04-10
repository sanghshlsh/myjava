package chap07.lecture.polymorphism.abstractKeyword;

public class Cat extends KindaCat {

	@Override
	public void cry() {
		// 추상메소드를 override하지 않는다면 compile error 발생
		// 자식클래스가 구현클래스일때 추상메소드는 반드시 override해야 한다.
		System.out.println("야옹");
	}

	
	
}
