//p.035
package chap02.examples;

public class VariableExample {
	public static void main(String[] args) {
		//10을 변수 value의 초기값으로 저장
		int value = 10;
		
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		value = 20; /*여기서 변수 value 값을 변경해도 순서대로 
		진행되기에 변수 result값에는 영향이 없다*/ 
		
		//변수 result 값을 일고 콘솔에 출력
		System.out.println(result);
	}
}