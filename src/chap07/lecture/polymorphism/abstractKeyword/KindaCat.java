package chap07.lecture.polymorphism.abstractKeyword;

public abstract class KindaCat {
	//abstract 이 클래스로는 인스턴스를 만들 수 없게 하는 키워드//추상클래스선언 

		public abstract void cry();//추상 메소드로 선언
		//추상 메소드가 있다면 구현 클래스 일 수 없고 반드시 추상 클래스로 만들어야 한다.
		
		
		
		public void hide() {
			System.out.println("박스에 들어갑니다.");
		}
}
