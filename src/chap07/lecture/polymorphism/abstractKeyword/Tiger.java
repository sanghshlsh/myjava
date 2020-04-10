package chap07.lecture.polymorphism.abstractKeyword;

public class Tiger extends KindaCat {

	@Override
	public void cry() {
		System.out.println("어흥");
		// 추상메소드를 override하지 않는다면 compile error 발생
		// 자식클래스가 구현클래스일때 추상메소드는 반드시 override해야 한다.
	}

	
	
}
