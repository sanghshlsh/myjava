package chap07.exercises.exercise6;

public class ChildExample {
public static void main(String[] args) {
	Child child = new Child();
}
}
//출력결과작성

//child 객체생성
//	
/*
private String name;

public Child() {
	this("홍길동");
	System.out.println("Child() call");
}

public Child(String name) {
	this.name = name;
	System.out.println("Child(String name) call");
}
*/
//위 클래스의 child 생성자에의해 //Child() 실행 내부의 super()실행
//parant클래스의
//public Parent() {
//this("대한민국");
//System.out.println("parent() call");
//}
//실행 this("대한민국")의 sout 먼저 출력
//다음 Parent()내부의 sout출력
//Child()내부의 this("홍길동") 실행
//child("홍길동") 초기화 sout 출력
//Child()내부의 sout출력