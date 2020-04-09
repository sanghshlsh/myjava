package codingbat.logic;

public class logic2 {
	// makebricks
	public boolean makeBricks(int small, int big, int goal) {
		if (small > 5) {
			return (goal - 5 * big) <= small;
		}
		return goal / 5 <= big && goal % 5 <= small;
	}

	// loneSum
	public int loneSum(int a, int b, int c) {

		int sum = 0;
		if (a != b && a != c)
			sum += a;
		if (a != b && b != c)
			sum += b;
		if (a != c && b != c)
			sum += c;
		return sum;
	}

	// luckySum
	public int luckySum(int a, int b, int c) {
		int sum = 0;
		if (a != 13)
			sum += a;
		if (b != 13 && a != 13)
			sum += b;
		if (c != 13 && b != 13 && a != 13)
			sum += c;
		return sum;
	}

	// noTeenSum
	public int noTeenSum(int a, int b, int c) {
		return fixTeen(a) + fixTeen(b) + fixTeen(c);
	}

	public int fixTeen(int n) {
		if (n < 13 || n > 19 || n == 15 || n == 16)
			return n;
		return 0;
	}

	// roundSum
	public int roundSum(int a, int b, int c) {
		return round10(a) + round10(b) + round10(c);
	}

	public int round10(int num) {
		if (num % 10 >= 5)
			return (num / 10 + 1) * 10;
		return num / 10 * 10;
	}

	// closeFar
	public boolean closeFar(int a, int b, int c) {
		return Math.abs(a - b) < 2 ^ Math.abs(a - c) < 2 ^ Math.abs(b - c) < 2;
	}

	// blakcjack
	public int blackjack(int a, int b) {
		int max = 0;
		if (21 - a >= 0)
			max = a;
		if (b <= 21 && max < b)
			max = b;
		return max;
	}

	// evenlySpaced
	public boolean evenlySpaced(int a, int b, int c) {

		int max;
		int mid;
		int min;
		if (a > b) {
			if (b > c) {
				max = a;
				mid = b;
				min = c;
			} else {
				if (a > c) {
					max = a;
					mid = c;
					min = b;
				} else {
					max = c;
					mid = a;
					min = b;
				}
			}

		} else {
			if (b < c) {
				max = c;
				mid = b;
				min = a;
			} else {
				if (a > c) {
					max = b;
					mid = a;
					min = c;
				} else {
					max = b;
					mid = c;
					min = a;
				}
			}
		}
		return max - mid == mid - min;
	}

	// makeChocolate
	public int makeChocolate(int small, int big, int goal) {
		if ((goal / 5 - big) > 0)
			return (goal - 5 * big) > small ? -1 : goal - 5 * big;
		return goal % 5 > small ? -1 : goal % 5;
	}

}
