package chap04.exercises;

public class Exercise04 {

	public static void main(String[] args) {

		int i = 0;

		while (true) {
			int a = (int)(Math.random()*6+1);
			int b = (int)(Math.random()*6+1);
			System.out.println("("+a+" ,"+b+")");
			if(a+b==5)
				break;
		}
	}
}
