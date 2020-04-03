package chap05.array;

public class Copy {
	public static void main(String[] args) {
		int[] a = { 9, 8, 7, 6 };
		int[] b = new int[10];
		// 배열을 복사하려면 복사받을 배열이 복사할 배열보다 작으면 안된다.

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		for (int v : b) {
			System.out.println(v);
		}

	}
}
