package chap04.forloop;

public class ForLoop {
	public static void main(String[] args) {
		
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		
		System.out.println(("1~5까지의 합: "+sum));
		
		sum = 0;
		//for의 기본구조 1->2(true)->3->4->2(false)까지 반복
		//2(false)->종료
		//for(1.초기화식;2.조건식;4증감식){
		//3실행문
		//}
		//for(생략가능;변수조건;생략가능) 단, 이전에 변수가 선언되어 있어야한다.
		for (int i = 0; i <= 5; i++) {
			sum = sum + i;
		}
		
		System.out.println(("1~5까지의 합: "+sum));

		sum = 0;
		
		int  i = 0;
		for (;i<=5;) {
			sum = sum+i;
			
			i++;
			
		}
		System.out.println(sum);
	
		//변수를 ,로 구분하여 복수개 사용 가능하다.
		for (int j=0, k=10;j<10&&k>0;j++,k--) {
			System.out.println(j+","+k);
		}
		//System.out.println(j);
		//System.out.println(k);
		//for문의 중괄호 안에서 j와k가 선언되었기에 for문의 중괄호 밖에선 사용불가능하다.
		//사용하고자 한다면 밖에 다시 선언하라
		
		
	}
}
