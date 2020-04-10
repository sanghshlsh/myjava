package chap07.exercises.exercise5;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name,int studentNo) {
		super(name);//부모클래스의 생성자를 미리 선언하지 않아 컴파일 에러 발생
		//부모클래스의 생성자가 parameter가없다면 자동생성하지만 parameter존재
		this.name = name;
		this.studentNo = studentNo;
	}
	
}
