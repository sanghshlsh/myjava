package chap04.switchcase;

public class Type {
	public static void main(String[] args) {
		
		//int, byte, short, char, String
		// Enum, Integer, Byte, Short, Char
		//long은 x
		int a = 1;
		switch (a) {
		case 1:
			System.out.println("사용 가능");
			break;

		default:
			break;
		}
	}
}
