package chap02.variables;

public class Variables {
	public static void main(String[] args) {
		
		System.out.println("변수에 대해서 배워보자");
		//(sysout or sout) +ctrl+space 
		System.out.println("main/sysout or sout");
		
		
		//변수는 하나의 값을 저장할 수 있는 공간의 이름
		
		//변수 선언
		//타입 변수명; 순서대로 작성
		int a;//타입 int 변수명 a
		double value;//타입 double 변수명 value
		//한번에 여러개 선언도 가능
		int x, y, z;
		//변수 이름을 지정하는 규칙
		//영문대소문자, $, _, 숫자의 조합
		//숫자가 먼저 오면 안됨
		int $;
		int $value;
		int _age;
		int _;
		int age_of_person;
		int city6;
		
		//int 3city;  불가
		//int city 3; 불가
		
		//변수명 작성 관습 lowerCamelCase
		//소문자로 작성하되, 여러단어가 결합된 경우 
		//두번째 단어부터 앞글자는 대문자로
		int ageOfPerson;
		int lowerCamelCase;
		//위법칙에 위배되지 않더라도 예약어(keword)는 변수명으로 작성 불가
		/*
		int int;
		int public;
		int private;
		*/
		
		
		
	}//main+ctrl+space
}
