package chap07.lecture.inheritance;

public class Parent {
	public int i;
	
	private int k;
	//이 accessModifier는 클래스외부에서 접근을 차단하여 상속이 불가하다.
	
	public void method() {
		
	}
}
//새로운 클래스를 만드는데 이 설계도의 정보를 그대로 쓰고 싶다면 extends Parent
//이클래스를 상속받은 클래스를 다른클래스가 다시 상속 받을 수 있다. 상속->상속 ok
// 하나의 클래스는 여러개의 클래스에 상속 해 줄 수 있지만,
// 하나의 클래스가 상속 받을 수 있는 클래스는 하나이다.