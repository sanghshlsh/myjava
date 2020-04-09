package chap07.examples.sec070402;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}else {
			
			super.fly();//Airplane 객체(부모객체) fly()method 호출
		}
	}

	
}
