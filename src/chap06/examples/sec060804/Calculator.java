package chap06.examples.sec060804;

public class Calculator {
	double areaRectangle(int width) {//2번 method와 parameter가 달라 다른 method 취급
		System.out.println("int type");
		return width*width;
	}
	
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width*width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width*height;
	}
}
