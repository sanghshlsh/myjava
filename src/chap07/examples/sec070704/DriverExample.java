package chap07.examples.sec070704;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);//자동 타입 변환 Vehicle vehicle = bus;
		driver.drive(taxi);//				Vehicle vehicle = taxi;
	}
	
	public static Vehicle getVehicle() {
		Taxi t = new Taxi();
		return t;
	}
}











