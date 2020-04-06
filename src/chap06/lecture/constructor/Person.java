package chap06.lecture.constructor;

public class Person {
	String name;
	int age;
	
//	Person(String n, int a){
//		this.name = n;
//		this.age = a;
//		System.out.println(this.name);
//		System.out.println(this.age);
//	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println(this.name);
		System.out.println(this.age);
	}
//	Person(String n, int a){
//		name = n;
//		age = a;
//	}
}
