package chap05.exercises;

import java.util.Scanner;

public class ScannerNextInt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
	System.out.print("입력: ");
	int i = scanner.nextInt();//입력한 값이 정수로 변환된 값이 return
	
	System.out.println(i*i);
	}
	
	
}

//nextInt()		엔터나 공백전까지의 문자
//nextLine()	엔터 전까지(내가친 엔터가 아니라도.)
