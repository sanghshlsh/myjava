package chap03.binary.bitwise;

public class Bitwise {
	public static void main(String[] args) {
	//&, |, ^, ~(단항)
	
	//& (둘다 1일 경우만 1, 나머지는 0)
	int a = 45;//2진법으로 	00101101
	int b = 25;//			00011001
	
	int c = a & b;//		00001001 =9	각비트 별 연산
	
	System.out.println(c);
	
	
	//| (둘다 0일 경우만 0, 나머지는 1)
	c = a | b;
	//0010 1101
	//0001 1001
	//0011 1101 = 61
	System.out.println(c);
	
	//^ (둘이 다르면 1, 같으면 0)
	c = a ^ b;
	//0010 1101
	//0001 1001
	//0011 0100  = 52	
	System.out.println(c);
	
	//~(단항연산자)(비트를 반대로 변경) 
	c = ~a;
	//		0010 1101
	//11~11 1101 0010 
	//지금까진 앞에 다 000000이있어서 줄여썼지만 ~a에는 1101 0010앞에 24비트의 1이 있다.
	System.out.println(c);
	
	
	
	// >>, <<, >>> 쉬프트연산자
	
	//<< (모든 비트를 왼쪽으로 몇 칸씩 이동)
	a=1;		//00~ 0001        	범위를 넘어 좌측으로 밀린 비트는 삭제
	c = a << 1; //00~ 0010			좌측으로 이동해 생긴 빈칸은 0으로 채워진다.
	System.out.println(c);
	c = a << 3;
	System.out.println(c);
	
	a=-8;
	c = a << 3;
	System.out.println(c);
	
	//>> (모든 비트를 오른쪽으로 몇 칸씩 이동)
	a = 16;		//1 0000		우측으로 이동해 넘어간 비트는 삭제
	c = a >> 1;	//0 10000		우측이로 이동해 생긴 빈칸은 부호비트와 같은값으로 채워진다.
	System.out.println(c);
	
	
	//>>>(모든 비트를 오른쪽으로 몇 칸씩 이동)
	//>>와 >>>차이는 >>는 채우는 비트가 부호비트 >>>는 채우는 비트가 0
	
	a = -8;
	c = a>>>1;
	System.out.println(c);
	}
}