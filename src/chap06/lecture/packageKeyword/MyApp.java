package chap06.lecture.packageKeyword;

//어떤 패키지 안에 패키지를 하나만 사용하지 않고 여러개를 사용 하려면 다음과 같이 사용
import java.util.*;
//import java.util.List;
//import java.util.Scanner;
import chap06.lecture.packageKeyword.subPackage.YourClass;

//import static java.lang.Math.random;
//static method import(Math.random()의 Math생략가능)
import static java.lang.Math.*;//random 뿐아니라 abs까지 포함되는 모든 Math패키지들에 적용


public class MyApp {
	public static void main(String[] args) {
		
		chap06.lecture.packageKeyword.MyClass c1 = new chap06.lecture.packageKeyword.MyClass();
		MyClass c2 = new MyClass();//실제론 위 처럼 사용해야 하나 같은 패키지 안에 있는것이 명확해서 이렇게 줄여 사용 할 수 있었다.
		
		//다른 패키지에 있는 경우
		chap06.lecture.packageKeyword.subPackage.YourClass c3 = new chap06.lecture.packageKeyword.subPackage.YourClass();
		//이를 줄여 쓰기 위해선 명시를 해야한다 //import chap06.lecture.packageKeyword.subPackage.YourClass;

		YourClass c4 = new YourClass(); 
		
		//다른 패키지 안에도 같은 이름의 클래스가 있는 경우
		//다른 패키지 안의 클래스를 사용하려면 아래처럼 해야 한다.
		chap06.lecture.packageKeyword.subPackage.MyClass c5 = new chap06.lecture.packageKeyword.subPackage.MyClass();
		
		
		//scanner또한 java.util패키지 안의 클래스여서 다음과 같이 사용했어야 했다.
		java.util.Scanner scanner1 = new java.util.Scanner(System.in);
		//이를 줄여쓰기 위해 import java.util.Scanner;
		//ctrl+shift+o
		Scanner scaner1 = new Scanner(System.in);
	
		
		
		List list3;
	
		String str = "";
		
		double d = Math.random();
		int i = abs(10-11);
		
		
		
	}
}
