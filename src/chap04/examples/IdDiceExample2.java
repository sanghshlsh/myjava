package chap04.examples;

public class IdDiceExample2 {
	public static void main(String[] args) {
		//두개의 주사위를 굴려서
		//값이 같으면 당첨,아니면 낙첨
		
		int num1 = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1;
		
		if(num1==num2)
			System.out.println("당첨");
		else
			System.out.println("낙첨");
	}
}
