package chap07.examples.sec070401;

public class Computer extends Calculator {
	@Override	//생략가능
	//다음에 오는 airCircle() method가 정확히 오버라이딩 된것인지 컴파일러가 체크 해 준다.
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
//	@Override
//	void overridingChec() {
//		
//	}

}
