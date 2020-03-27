package chap02.datatype;

public class Logn1 {
	public static void main(String[] args) {
		//8byte 크기를 가진다.
		//-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		
		long l;
		l = 2147483647;
		l = 2147483648L;//integer범위의 수만 compiler가 기본으로 제한하고 있기에 숫자의 뒤에 그 범위를 벗어난다는 뜻의 L을 쓰지 않는다면 적용되지 않는다.
		l = 3000000000l;//소문자 l 도 문제없이 작동하긴 하나 숫자 1과 혼동의 여지가 있어 대문자L을 사용하는것을 권장한다.
		System.out.println(l);
	}
}
