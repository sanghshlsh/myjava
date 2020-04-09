package chap07.lecture.protectedKeyword.package2;

import chap07.lecture.protectedKeyword.package1.Parent;

public class OtherChild {
	public static void main(String[] args) {
		Parent p = new Parent();
		//p.defaultField = 3;	//다른패키지
		//p.protectedField = 3;	//다른패키지+상속x
	}
}
