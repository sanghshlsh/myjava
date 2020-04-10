package chap07.examples.sec070803;

public class PhoneExample {
public static void main(String[] args) {
	//Phone phone = new Phone();
	
	SmartPhone smartPhone = new SmartPhone("홍길동");
	
	smartPhone.turnOn();
	smartPhone.internetSearch();
	smartPhone.turnOff();

	Phone phone = smartPhone;
	SmartPhone s1 = (SmartPhone) phone;
	
}
}
