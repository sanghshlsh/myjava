package chap03.binary.arithmetic;

public class Overflow {
	public static void main(String[] args) {
		//변수 범위 유의할것
		int i1 = 2000000000;
		int i2 = 1000000000;

		int avg = (i1 + i2) / 2;
		System.out.println(avg);

		long l1 = 2000000000;
		long l2 = 1000000000;

		long avg2 = (l1 + l2) / 2;
		System.out.println(avg2);

	}
}
