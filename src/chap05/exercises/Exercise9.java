package chap05.exercises;

import java.util.Scanner;

public class Exercise9 {
//학생 수와 학생들의 점수를 키보드로부터 입력받아 최고점수,평균점수를 구하는 프로그램
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				//작성위치
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				//작성위치
				for(int i=0;i<studentNum;i++) {
					System.out.print("scores["+i+"]>");
//					int score =  scanner.nextInt();
//					scores[i] = score;	
					//한줄로 써도 된다.
					scores[i] = scanner.nextInt();
				}
			} else if(selectNo == 3) {
				//작성위치
				for(int i=0;i<studentNum;i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
				}
			} else if(selectNo == 4) {
				//작성위치
				int sum=0;
				int max=0;
				for(int i=0;i<studentNum;i++) {
					if(scores[i]>max)
						max=scores[i];
					sum+=scores[i];
				}
				//향상된 for문
				//for(int v : scores){
				//max = max<v?v:max;
				//sum+=v;
				//}
				System.out.println("최고점수 : "+max);
				System.out.println("평균점수 : " + (double)sum/studentNum);
				
			} else if(selectNo == 5) {
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
		
	}
}
