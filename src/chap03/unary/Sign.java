package chap03.unary;

public class Sign {
	public static void main(String[] args) {
		//부호연산자
		int i1 = +100;
		int i2 = -100;
		double d1 = +3.14;
		double d2 = -10.5;
		
		int r1 = -i2;
		int r2 = +i2;
		
		short s = 100;
		//short r3 = -s;
		//묵시적 변환때문에 int type이 되기에 short타입으로 받을 수 없다.
		short r3 = (short) -s;//이렇게 한다면 가능
		int r4 = -s;
		
	}	
}
