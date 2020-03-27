package chap02.datatype;

public class Integer1 {
	public static void main(String[] args) {
		//4byte 크기
		//-2,147,483,648 ~ 2,147,483,647

		int i;
		i = 2147483647;
		//i = 2147483648;//범위 벗어남
		//over/underflow일어난다.
		
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		//숫자가 너무 커 알아보기 힘들어 구분을 하고 싶으면 _를 이용한다.
		i = 2_147_483_647;
		//구분기호 _는 굳이 세자리단위로 사용할 필요 없이 막 써도 상관없다.
		i = 2_147483647;
		
		i = 0765;// 물론 8진법 16진법등으로도 사용가능하다.
		i = 0xACCF;
	
	
	}
}
