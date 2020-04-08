package chap06.examples.sec061401;

public class Car {
	//field private로 외부에서 바로 접근못하게만듬
	private int speed;
	private boolean stop;
	
	//constructor
	
	//method
	//speed읽을 수 있는method노출
	public int getSpeed() {
		return speed;
	}
	//speed setting할수 있는 method노출
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		}
		else {
			this.speed = speed;
		}
	}
	//stop 읽을 수 있는method노출
	public boolean isStop() {
		return stop;
	}
	//stop  setting할수 있는 method노출
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
}
