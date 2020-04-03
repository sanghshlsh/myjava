package chap05.array;

public class CopyUtil {
	public static void main(String[] args) {
		int[] a = { 9, 8, 7 };
		int[] b = new int[5];

		System.arraycopy(a, 0, b, 0, a.length);
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//src 		: 원본(복사할배열)
		//srcPos 	: 원본배열에서 복사를 시작할 index
		//dest		: 새배열(복사받을)
		//destPos	: 새배열에서 붙여넣을 시작 index
		//length	: 복사할 개수

		for (int v : b) {
			System.out.println(v);
		}
	}
}
