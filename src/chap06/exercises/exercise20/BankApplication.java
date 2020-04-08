package chap06.exercises.exercise20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int count = 0;

	public static void main(String[] args) {
	
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();
			scanner.nextLine();	//nextLine을 앞으로 쓰려면 이것을 추가하고 nextInt 를 쓰려면 추가하지말고 parseInt로 정수변환을하고 사용하라

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	// 계좌생성하기
	private static void createAccount() {
		// 작성위치

		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");

		

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		scanner.nextLine();
		Account account = new Account(ano, owner, balance);
		accountArray[count] = account;
		count++;

		System.out.println("결과 : 계좌가 생성되었습니다.");
	}

	// 계좌목록보기
	private static void accountList() {
		// 작성위치
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
	

		for (int i = 0; i < count; i++) {
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}

	// 예금하기
	private static void deposit() {
		// 작성위치
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌번호");
		String ano = scanner.nextLine();
		System.out.print("예금액");
		int balance = scanner.nextInt();
		scanner.nextLine();
		Account account = findAccount(ano);//참조값을 받았기에 이method에서 실행하는것은 바로 accountArray에 바로 적용된다.
		account.setBalance(account.getBalance()+balance);
		System.out.println("결과: 예금이 성공되었습니다.");
		
		
	}

	// 출금하기
	private static void withdraw() {
		// 작성위치
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		System.out.print("계좌번호");
		String ano = scanner.nextLine();
		System.out.print("출금액");
		int balance = scanner.nextInt();
		scanner.nextLine();
		Account account = findAccount(ano);
		account.setBalance(account.getBalance()-balance);
		System.out.println("결과: 출금이 성공되었습니다.");
		
		
	}
	// Account 배열에서ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
	// 작성위치
		for(int i = 0; i < count; i++) {
		if(accountArray[i].getAno().equals(ano))
		return accountArray[i];
		}
		return null;
		
		
	}

}
