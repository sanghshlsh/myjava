package chap07.lecture.polymorphism.abstractKeyword;

public class AbstractApp {

public static void main(String[] args) {
	//KindaCat k1 = new KindaCat();//이를 인스턴스로 만들수 없게 제한하려면 해당 클래스앞에 abstract를 붙여라
	//k1.cry();		
	
	Tiger t = new Tiger();
	Cat c = new Cat();
	t.cry();
	c.cry();
	
	KindaCat k2 = new Tiger();	//추상 메소드가 있다면 subclass에서는 반드시 abstact method를 override했기떄문에 
	k2.cry();					//추상메소드가 구현되어 있다는 것은 보장되어있다.			
}
}
