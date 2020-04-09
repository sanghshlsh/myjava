package chap07.lecture.protectedKeyword.package2;

import chap07.lecture.protectedKeyword.package1.Parent;

public class Child extends Parent {
	void method() {
		//this.defaultField = 3;	//다른패키지에 있어서 접근불가
		this.protectedField = 3;	//다른패키지에 있지만 상속받아 접근 가능
	}
	
}
