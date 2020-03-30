package chap02.typecasting;

public class Explitcit {
	public static void main(String[] args) {
		//1byte		2byte		4byte	8byte		4byte(실수)	8byte(실수)
		//byte	→	short	→	int	→	long	→	float	→	double
		//			char	↗
		//강제(명시적) 타입 변환 (Casting)
		
		int i = 103029770;
		byte b = (byte) i;
		
		System.out.println(i);
		System.out.println(b);
		//거꾸로 값이 변환될 경우 값을 잃어 버릴 수 있다. 
		//int는 4바이트 byte는 1바이트인데 byte에 int를 넣는 경우 int를 1바이트씩 쪼개고 
		//앞의 3바이트를 버린 후 맨뒤의 1바이트 값만을 byte변수에 저장한다.
		//()안에 들어가는 타입이 쪼개는 단위이다.
		long l = 300;
		i=(int) l;
		System.out.println(l);
		System.out.println(i);
		
		int intValue = 'A';
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		double d = 3.14;
		int i3 = (int) d;
		System.out.println(i3);
		//실수 타입은 정수 타입으로 자동 변환되지 않기에 강제변환을 사용해야 하고
		//실수 타입의 변수를 정수 타입의 변수로 변환시킨다면
		//소수점 이하부분은 버려지고 정수 부분만 저장된다.
		
		
	}
}
