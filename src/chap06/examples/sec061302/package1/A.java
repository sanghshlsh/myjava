package chap06.examples.sec061302.package1;

public class A {
//field
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//counstructor
	public A(boolean b) {}	//public accessModifier
	A(int b){}				//default accessModifier
	private A(String s) {}	//private accessModifier
}
