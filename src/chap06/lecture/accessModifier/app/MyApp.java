package chap06.lecture.accessModifier.app;

import chap06.lecture.accessModifier.api.YourClass;

public class MyApp {
	YourClass y = new YourClass();
	//chap06.lecture.accessModifier.api.MyClass m; MyClass에는 public이 빠져 해당 패키지 밖에서는 부를 수 없다.
	
	
	void method() {
		y.i = 3;//public i 이기에 다른패키지 내부에 있어도 사용 가능
		//y.j = 4;//deafault accessModifier를 가져 다른패키지에서는 사용 불가
		//k = 4; // private accessModifer는 해당 클래스에서만 사용 가능
	}
}
