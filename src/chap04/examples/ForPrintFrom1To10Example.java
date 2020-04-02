package chap04.examples;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		for(int i = 1; i<=10;i++) {
			System.out.println(i);
		}
	
		for(int i = 10; i>0;i--) {
			System.out.println(i);
		}
	
		for (int j=0, k=10;j<10&&k>0;j++,k--) {
			System.out.println(j+","+k);
		}
	}
}
