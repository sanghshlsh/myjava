package chap07.exercises.exercise7;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		//System.out.println("스노우 타이어가 굴러갑니다.");
		tire.run();
		//System.out.println("스노우 타이어가 굴러갑니다.");
	}
}
