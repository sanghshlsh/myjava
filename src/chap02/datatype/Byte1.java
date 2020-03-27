package chap02.datatype;

public class Byte1 {
	public static void main(String[] args) {
		byte b;	//1byte(8bit)의 저장공간을 가지고 있다.//1bit = 0이나 1 하나의 값을 가질 수 있다.
				// -128~127 까지 표현 가능
		
		b = 127;
		
		System.out.println(b);
		
		//b = 128;//표현범위를 넘어 변수값저장불가.
		
		b++;//127에서 1이 늘어나면 128로 범위를 넘어서 overflow가 일어나 최소값으로 변한다.
		System.out.println(b);
		
		b = -128;
		b--;// underflow
		

		//음수는 1xxx xxxx
		//양수는 0xxx xxxx
		//이런점때문에 overflow와 underflow발생
	}
}
