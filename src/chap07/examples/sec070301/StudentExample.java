package chap07.examples.sec070301;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567",1);
		System.out.println("name : " + student.name);	//상속받은 field
		System.out.println("ssn : " + student.ssn);		//상속받은 field
		System.out.println("studentNo : "+student.studentNo);
	}
}
