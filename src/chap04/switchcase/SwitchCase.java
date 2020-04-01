package chap04.switchcase;

public class SwitchCase {
	public static void main(String[] args) {
		int i = 3;
		
		//case 블럭은 switch문에 몇개가 있어도 상관없고 
		//break문을 만날때 까지 실행
		//switch의 값이 어떤case와도 일치하지 않으면 default로 간다. 그렇기에 default키워드는 보통 최하단에 위치
		switch(i) {
		case 1:
			System.out.println("실행되지 않는 블럭");
			break;
			
		case 2:
			System.out.println("실행되지 않는 블럭");
			break;
		
		case 3:
			System.out.println("실행되는 블럭");
			//break;//생략된다면 그다음도 생략되지 않고 실행
			
		case 4:
			System.out.println("case 4 블럭");
			break;
			
		default:
			break;
			
		}
	}
}
