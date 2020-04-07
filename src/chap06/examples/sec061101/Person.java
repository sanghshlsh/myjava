package chap06.examples.sec061101;

public class Person {

	final String nation = "Korea";//field 에서 할당
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;//constructor에서 할당
		this.name = name;
	}

}
