package chap07.lecture.inheritance;

public class MyApp {
	public static void main(String[] args) {
		Child c = new Child();
		c.i = 30;
		c.method();
		
		GrandChild g = new GrandChild();//상속받은것을 또 상속 할 수도 있다.
		g.i = 40;
		g.method();
	}
}
