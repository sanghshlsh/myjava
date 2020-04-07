package chap06.lecture.finalKeyword;

public class FinalKeyword {
	//변수 앞에 붙으면
	//값을 할당할 기회를 한 번만 갖는다.
	//final int i = 99;//field에 final이 붙으려면 field에서 변수에 값을 직접 할당해 놓거나 생성자에서 한번 초기화시키거나 둘중 하나를 선택해야 한다.
	final int i;
	
	FinalKeyword(){
		i = 90;
	}
	
	
	void method(final int k) {
		//k = 90;
		final int i;
		i = 30;
		//i = 20;
		final int j = 60;
		//j = 70;
	}
}
