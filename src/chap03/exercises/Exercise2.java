package chap03.exercises;
/*
Exercise1
1)연산자는 피연산자의 수에 따라 단항, 이항, 삼항 연산자로 구분된다. 	o
2)비교 연산자와 논리 연산자의 산출 타입은 boolean(true/false)이다. 		o
3)연산식은 하나 이상의 값을 산출할 수도 있다.							x
4)하나의 값이 올 수 있는 자리라면 연산식도 올 수 있다.					o
*/
public class Exercise2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
	}
}
