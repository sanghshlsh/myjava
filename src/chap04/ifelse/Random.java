package chap04.ifelse;

public class Random {
	public static void main(String[] args) {
		double r = Math.random(); // 실행 할 때 마다 다르지만 값의 범위는 0보다 크고 1보다 작은 값이다.
		System.out.println(r);
		
		//0~9
		r *= 10;
		System.out.println(r);
		
		int i = (int) r;
		System.out.println(i);
		
		//1~10
		i += 1;
		System.out.println(i);
	}
}
