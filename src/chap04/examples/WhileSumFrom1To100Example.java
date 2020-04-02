package chap04.examples;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;//합계변수
		
		int i = 1;	//count변수
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-100+"합: " +sum));
	}
}
