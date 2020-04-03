package chap05.examples;

public class ArrayCopyExample {
	public static void main(String[] args) {
		// 그림 07 참조 타입 배열 복사
		String[] oldStrArray = { "Java", "array", "copy" };
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
	}
}
