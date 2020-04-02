package chap05.array;

public class Array {
	public static void main(String[] args) {
		int age1;
		int age2;
		int age3;
		;
		;
		;
		int age100;

		// 배열
		int[] ageArray;
		int ageArray5[];

		ageArray = new int[100];// 100개의 공간을 마련 초기값이 채워져 있다.

		// 배열의 초기값(0 or false or null) //int Array이므로 전부다 0
		System.out.println((ageArray[13]));

		// 배열의 초기값 할당
		int[] ageArray2;
		ageArray2 = new int[] { 3, 4, 1, 0, -11, 5, 22 };
		System.out.println(ageArray2[0]);
		System.out.println(ageArray2[6]);

		// 배열을 선언하며 값넣기
		int[] ageArray3 = { 2, 3, 5, 7, 9, 5, 1 };
		System.out.println(ageArray3[3]);
		System.out.println(ageArray3[6]);

		// 배열의 인덱스 0~길이-1

		// 배열의 길이
		System.out.println(ageArray.length);
		System.out.println(ageArray2.length);

		// ArrayIndexOutofBoundException
		// System.out.println(ageArray[100]);

		// 배열과 for
		System.out.println("----------------");
		for (int i = 0; i < ageArray3.length; i++) {
			System.out.println(ageArray3[i]);
		}

		// 배열의 값 변경
		ageArray3[3] = 3333;
		System.out.println(ageArray3[3]);

		// 향상된 for 문
		//	for(우측의 값을 받을 수 있는 변수 : 배열처럼 여러개의 값을 가진것 ) 
		//{
		// 차례로 한번씩넣어서 실행			
		//}
		for (int value : ageArray3) {
			System.out.println(value);
		}
	}
}
