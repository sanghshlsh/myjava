package chap07.examples.sec070705;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();	//자동 타입변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";
//		parent.method3();
		
		Child chlid = (Child) parent;	//강제 타입변환(casting) parent는 Child type에서 자동변환된 것으로 강제타입변환 가능
		chlid.field2 = "yyy";
		chlid.method3();
	}
}
