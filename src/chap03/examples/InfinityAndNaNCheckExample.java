package chap03.examples;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		//double z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(z + 2);	//문제가 되는 코드
		//Infinity 또는 NaN은 정상적인 연산이 불가능하므로 다음 연산을 못하게 막아야 한다.
	}
}
