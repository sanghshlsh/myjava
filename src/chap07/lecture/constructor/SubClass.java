package chap07.lecture.constructor;

public class SubClass extends SuperClass{
	public SubClass() {
		super();
		//parameter없는 생성자가 만들어진 이유는 superclass에 생성자를 만들지 않아 
		//parameter없는 생성자가 superclass에 자동으로 만들어졌기 때문
		//(상속받은 생성자로 생성할 때) 부모클래스의 생성자를 가장 먼저 호출해야 
		//하기 떄문에 맨윗줄에 자동으로 따라온다.
	}
}
