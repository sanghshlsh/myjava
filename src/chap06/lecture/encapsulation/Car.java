package chap06.lecture.encapsulation;

public class Car {
 private int speed;
 private String airbag;
 //field를 private로 접근 금지 시키고 method를 통해 접근가능하게 만듬
 public void setSpeed(int speed) {
	 if(speed<0)
		 this.speed = 0;
	 else
	 this.speed = speed;
	 
 }
 
 public Car() {
	 this.airbag = "전면";
 }
 public String getAirbag() {
	 return this.airbag;
 }
 
 
 
 //field를 접근 금지 시켰으니 이를 읽을 수 있게 만든 method
 public int getSpeed() {
	 return this.speed;
 }
}
