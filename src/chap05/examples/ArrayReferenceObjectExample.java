package chap05.examples;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3]; // {null,null,null}
		strArray[0] = "Java"; // {"Java",null,null}
		strArray[1] = "Java"; // {"java","java",null}
		strArray[2] = new String("Java"); // {"java","java","java"}

		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
	}
}
