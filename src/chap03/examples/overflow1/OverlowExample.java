package chap03.examples.overflow1;

public class OverlowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;//변수범위 벗어남
		System.out.println(z);
	}
}
