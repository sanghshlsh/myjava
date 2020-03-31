package chap03.binary.logical;

public class Logical {
	public static void main(String[] args) {
		//AND &&, &          &&와 &의 차이는 &&는 앞의 피연산자가 false면 뒤의 피연산자는 연산을 하지 않는다. 하지만 &는 앞의 피연산자가 false이어도 뒤의 피연산자를 연산하고 간다.
		//true	&& true	→ true
		//true	&& false→ false
		//false	&& true	→ false
		//false	&& true	→ false

		//true	& true	→ true
		//true	& false	→ false
		//false	& true	→ false
		//false	& true	→ false
	//////////////////////////////////////////////////////////////////////////			
		//OR ||, |			||와 |의 차이도 마찬가지로 ||의 경우 앞의 피연산자가 true 이면 뒤의 피연산자는 연산하지 않고 true 도출
		//true || true	→ true
		//true || false	→ true
		//false|| true	→ true
		//false|| false	→ false
		
		//true 	| true	→ true
		//true 	| false	→ true
		//false	| true	→ true
		//false	| false	→ false
	///////////////////////////////////////////////////////////////////////////	
		//XOR ^
		//true	^ true	→ false
		//true	^ false	→ true
		//false	^ true	→ true
		//false	^ false	→ false
		
		//NOT !(단항연산자 (이전에다룸))
		
////////////////////////////////////////////////////
			int i = 0;
			int j = 3;
			
			if(i != 0 & (j++) > 0) {
				System.out.println("결과 true");
			} else {
				System.out.println("결과 false");
			}
			System.out.println("j:"+j);
		
			
			
			if(i != 0 && (j++) > 0) {
				System.out.println("결과 true");
			} else {
				System.out.println("결과 false");
			}
			System.out.println("j:"+j);
			
			
		
			if(i != 0 & (j++) > 0) {
				System.out.println("결과 true");
			} else {
				System.out.println("결과 false");
			}
			System.out.println("j:"+j);
		
			//i = 0;
			//j = 3;
			//if (i != 0 & (j / i) > 0) {
			//	System.out.println("j를 i로 나눈 값은 양수");
			//}
			
			String s = null;
			if (s != null && s.length() > 0) {
				System.out.println("s는 빈 스트링이 아니다.");
			}
			
			
			
			i = 0;
			j = 3;
			if(i == 0 || (j++) > 0) {
				System.out.println("값은 true");
			} else {
				System.out.println("값은 false");
			}
			System.out.println(j);
		
			
			i = 0;
			j = 3;
			if(i == 0 | (j++) > 0) {
				System.out.println("값은 true");
			} else {
				System.out.println("값은 false");
			}
			System.out.println(j);
		
	}
}
