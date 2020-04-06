package chap06.lecture.field;

public class MyApp1 {
	public static void main(String[] args) {
		MyField f1 = new MyField();
		
		f1.a = 30;
		f1.n = "값";
		f1.d = 3.14;
		f1.b = false;		
		
		System.out.println(f1.a);
		System.out.println(f1.n);
		System.out.println(f1.d);
		System.out.println(f1.b);
		
		MyField f2 = new MyField();
	
		System.out.println(f2.a);
		System.out.println(f2.n);
		System.out.println(f2.d);
		System.out.println(f2.b);
		//field는 초기화 하지 않고도 사용이 가능한데 이들은 default값으로 0,false,null 값을 가진다.
		
		f2.a = 99;
		System.out.println(f2.a);
		System.out.println(f1.a);
		//각 instance가 가지고 있기에 instance field라 부른다.
		//공통으로 가지고 있는건 class/static field라 부른다.
		
	}
}
