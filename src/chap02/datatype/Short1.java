package chap02.datatype;

public class Short1 {
	public static void main(String[] args) {
		//2byte 크기
		//-32,768~32,767
		short s;
		s = 32767;
		//s = 32768; //범위를 벗어남
		//Byte타입과 마찬가지로 over/under flow 발생가능하다.
		
		System.out.println(s);
		s++;
		System.out.println(s);
		s--;
		System.out.println(s);
		
		
	}
}
