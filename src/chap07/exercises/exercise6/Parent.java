package chap07.exercises.exercise6;

public class Parent {
public String nation;

public Parent() {
	this("대한민국");
	System.out.println("parent() call");
}

public Parent(String antion) {
	this.nation = nation;
	System.out.println("Parent(String nation) call");
}
}
