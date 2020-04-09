package chap07.lecture.polymorphism;
//그림 10.다형성
public class PolyMorphismApp {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		Cat c = new Cat();
		
		t.cry();
		c.cry();
		
		KindaCat c1 = t;
		KindaCat c2 = c;
		
		c1.cry();//실제 instance의 method가 실행된다.
		c2.cry();//실제 instance의 method가 실행된다.
		
		//t = c1;
		//c = c2;
		
		long[] larr = new long[3];
		larr[0] = 3;		//자동타입변환
		larr[1] = 9348949L;
		
		
		Tiger[] tarr = new Tiger[3];
		tarr[0] = new Tiger();
		//tarr[1] = new Cat();
		//tarr[2] = new KindaCat();
		
		KindaCat[] karr = new KindaCat[3];
		karr[0] = new KindaCat();
		karr[1] = new Tiger();	//자동타입변환
		karr[2] = new Cat();	//자동타입변환
		
		
	}
}
