package chap06.examples.sec060704;

public class Car {
	//필드
	//생성자는 파라미터 타입의 조합과 순서에 따라 나뉜다.
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){//생성자-1
	}
	
	Car(String model){//생성자-2
		this.model = model;
	}
	
//	Car(String color){ 파라미터 타입이 같으면 같은 생성자로 취급해 에러가 발생
//		this.color = color;
//	}
	
	Car(String model, String color){//생성자-3
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color,int maxSpeed){//생성자-4
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car(String model, int maxSpeed, String color){//생성자-5 파라미터 순서가 생성자-4와 달라 다른생성자 취급
		
	}
}
