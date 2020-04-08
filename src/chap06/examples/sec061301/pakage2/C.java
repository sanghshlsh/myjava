package chap06.examples.sec061301.pakage2;

import chap06.examples.sec061301.pakage1.*;

public class C {
//A a;//default accessModifer는 다른패키지에서는 접근이 허용안되어 사용불가
B b; //public accessModifier는 다른 패키지에서도 접근이 가능하여 import문을 사용해 필드 선언 가능
}


class D{}

class E{}
//하나의 파일 안에 클래스가 여러개 있을 수 있지만
//public 클래스는 하나만 있을 수 있고 그것은 파일명과 같아야 한다.