package chap06.lecture.accessModifier.api;

//public을 지우면 같은 패키지 안 다른 클래스에서 해당클래스를 사용 할 수 있다.
//public은 해당 패키지 밖으로 공개 할지 말지를 결정짓는다
//public o 공개 x 비공개
class MyClass {
//default(p.257)
	
	void method() {
		YourClass y = new YourClass();
		y.i = 3;
		y.j = 4;//default accessModifier를 갖지만 같은 패키지 내부에서는 사용 가능
		//y.k = 5; private accessModifier는 같은 패키지 내부에서라도 다른 클래서에서는 사용 불가
	}
}
