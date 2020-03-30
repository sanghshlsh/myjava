package chap02.examples;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		System.out.println(num3);
		num2 = (int) num3;
		//23비트의 가수로는 123456780을 표현할 수 없어 근사치로 변환되는데 이떄 정밀도 손실이 발생
				
		//float 는 가수(23비트) 지수(8비트)
		//double 은 가수(52비트) 지수(11비트)
		//int는 (32비트)
		
		//num3정의할때 가수에 52비트를 가진 double type으로 저장했다면 result값은 0
		
		int result = num1 - num2;
		System.out.println(result);
	}
}
