package chap04.breakcontinue;

public class BreakContinue {
	public static void main(String[] args) {

		//라벨달아놓고 그것을 break로 종료시키는 방법은 권장되지 않는다. 
		/*라벨명:*/for (int j = 0; j < 5; j++) {
			System.out.println("j :" + j);
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				if (i == 2) {
					break;
					//가장 가까운 반복문을 종료
					//break 라벨명; 해당 라벨명을 가진 반복문 종료
				}
			}
			//continue 이후문장 실행x반복문 처음으로 돌아간다.
			for(int i = 0; i<5; i++) {
				System.out.println(i);
				if(i==2) {
					continue;
					}
				System.out.println("continue 문 이후 실행문");
			}
			
		}
	}
}
