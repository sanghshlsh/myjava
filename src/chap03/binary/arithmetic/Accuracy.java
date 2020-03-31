package chap03.binary.arithmetic;

public class Accuracy {
	public static void main(String[] args) {
		//정확한 계산을 필요로 할 때는 부동소수점 타입(float double)을 사용 하지 않는 것이 좋다.
		//굳이 사용을 해야 한다면정수 연산으로 변경해서 사용후 되돌려라.
		double d1 = 0.1;
		double d2 = 0.2;
		double d3 = d1 + d2;
		
		System.out.println(d3);
		
		double d4 = d1 * 10;
		double d5 = d2 * 10;
		double d6 = (d4 + d5) / 10;
		
		System.out.println(d6);
	}
}
