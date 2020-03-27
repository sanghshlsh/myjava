package chap02.datatype;

public class Character1 {
	public static void main(String[] args) {
		// 2byte
		// 문자를 등록하기 위한 타입이기에 음수값을 가지지 않는다.
		// 0 ~ 65535
		char c;
		c = 'A'; // 65
		System.out.println(c);
		
		
		c = '\u0041'; 		//수를 바로 입력해 문자를 사용할 수도 있는데 이떄는 \ u +16진법으로 2바이트를 입력하면 된다.
		System.out.println(c);
		c = 65; //10진수로 입력해 사용 할 수도 있다.
		System.out.println(c);
		
		
		c= '\uAC00';
		System.out.println(c);
		c='\uac00'; //대소문자는 상관 없다.
		System.out.println(c);		
				
	}
}
