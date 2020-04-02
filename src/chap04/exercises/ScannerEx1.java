package chap04.exercises;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// scanner 객체
		System.out.println("입력>");

		String n = scanner.nextLine();// 엔터가 들어가기 전까지 한 줄을 입력받고 입력받은 것을 return하는 method

		System.out.println("입력값:" + n);

		//입력받은 값을 정수나 실수로 변환하는 법
		int i = Integer.parseInt(n);
		double d = Double.parseDouble(n);
	
	}
}
