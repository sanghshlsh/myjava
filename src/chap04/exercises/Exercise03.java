package chap04.exercises;


// 	Ex1	조건문: if,witch
//				for, while, do-while

//	Ex2
//	1)if문은 조건식의 결과에 따라 실행 흐름을 달리할 수 있다.			o
//	2)switch문에서 사용할 수 있는 변수 타입은 int,double이 될 수 있다. 	x실수타입x
//	3)for문은 카운터 변수로 지정한 횟수만큼 반복시킬 때 사용할 수 있다.	o
//	4)break문은 switch문,for문,while문을 종료할 때 사용할 수 있다.		o



public class Exercise03 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("3의 배수의 합: " + sum);
	}

}
