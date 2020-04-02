package chap04.whileloop;

public class DoWhileLoop {
	public static void main(String[] args) {
		int i = 0;
		while (i != 0) {
			System.out.println("while 반복");
			
		}
		do {
			System.out.println("do while 반복");
		}while(i != 0);
		
		//do {
		//	일단 한번은 실행하고 시작하는 statement 조건에따라 더 실행
		//}while(조건);
		
		System.out.println("종료");
	}
}
