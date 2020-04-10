package chap07.examples.sec070804;

public abstract class Animal {//abstract class
	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); //abstract method

}
