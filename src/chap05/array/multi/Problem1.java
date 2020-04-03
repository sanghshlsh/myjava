package chap05.array.multi;

public class Problem1 {
	public static void main(String[] args) {
		int[][] origin = { { 3, 4, 5 }, { 100, 101 }, { -3, -2, -1, 0 } };
		int[] target = null;
		// {0, -1, -2, -3, 101, 100, 5, 4, 3};

		int k = 0;
		int len = 0;

		for (int i = 0; i < origin.length; i++) {
			len += origin[i].length;
		}

		target = new int[len];

		for (int i = origin.length - 1; i >= 0; i--) {
			for (int j = origin[i].length - 1; j >= 0; j--) {
				target[k] = origin[i][j];
				k++;
			}
		}

		for (int i = 0; i < target.length; i++) {
			System.out.println(target[i]);
		}

	}
}