package chap07.lecture.polymorphism.casting;

import chap07.lecture.polymorphism.Cat;
import chap07.lecture.polymorphism.KindaCat;
import chap07.lecture.polymorphism.Tiger;

public class CastingApp {
	public static void main(String[] args) {
		//그림.12 타입 캐스팅
		Cat c = new Cat();
		Tiger t = new Tiger();
		
		KindaCat k1 = c;//자동 변환	//Cat type(KindaCat 자식클래스)은 상위(부모클래스)클래스인 KindaCat Type으로 자동변환
		KindaCat k2 = t;//
		
		Cat c1 = (Cat) k1;	//강제 변환(Casting) k1(자식클래스인 Cat Type에서 자동변환된 KindaCat type)은 다시 Cat type으로 강제 변환 가능
		Tiger t1 = (Tiger) k2;
		
		System.out.println(k1 instanceof Tiger);
		if (k1 instanceof Tiger) {
			Tiger t2 = (Tiger) k1;
		}
		
		System.out.println(k1 instanceof Cat);
		System.out.println(k1 instanceof KindaCat);
	}
}
