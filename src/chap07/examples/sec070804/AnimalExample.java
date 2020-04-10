package chap07.examples.sec070804;

public class AnimalExample {

	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		//자동타입변환과 재정의된 메소드 호출
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("------");
		
		
		//메소드 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();		
	}
	//윗줄과 아랫줄은 동일한 행동
	
	
}
