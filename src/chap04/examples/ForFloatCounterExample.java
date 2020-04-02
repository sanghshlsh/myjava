package chap04.examples;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		for(float x = 0.1F;x<1.0F; x += 0.1F) {
			System.out.println(x);
		}
	}
	//for문에 실수형타입을 루프카운트변수로 넣는것에 주의하라.
}
