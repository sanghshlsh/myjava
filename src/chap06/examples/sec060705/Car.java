package chap06.examples.sec060705;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
	}

	//this();
	//()안에 있는 파라미터에 따라 어떤 생성자를 호출해 올지 선택한다.
	//예를 들어 ()이라면 car()생성자를 불러오고
	//("")이라면 Car(String model)
	//("", "", 0)라면 Car(String model, String color,int maxSpeed)
	
	Car(String model){
		this(model,"은색",250);		//마지막 생성자 호출
	}
	
	
	Car(String model, String color){
		this(model,color,250);		//마지막 생성자 호출
	}
	
	Car(String model, String color,int maxSpeed){
		this.model = model;			//공통 실행 코드
		this.color = color;			//공통 실행 코드
		this.maxSpeed = maxSpeed;	//공통 실행 코드
	}
	
}
