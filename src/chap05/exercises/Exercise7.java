package chap05.exercises;

public class Exercise7 {
//주어진 배열의 항목에서 최대값 구하기 for문이용
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		//작성위치
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max)
				max=array[i];
		}
		//향상된 for문 사용시
		//for( int v : array) {
		//	max = max<v?v:max;
		//}
		System.out.println("max: " + max);
	}
}
