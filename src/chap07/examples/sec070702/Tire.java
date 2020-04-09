package chap07.examples.sec070702;

public class Tire {
//field
	public int maxRotation;				//최대 회전수(타이어 수명)
	public int accumulatedRotation;		//누적 회전수
	public String location;				//타이어의 위치
	
	//constructor
	public Tire(String location, int maxRotation) {
		this.location = location;		//location 초기화
		this.maxRotation = maxRotation;	//maxRocation 초기화
	}
	
	
	//method
	
	public boolean roll() {
		++accumulatedRotation;								//누적증가
		if(accumulatedRotation<maxRotation) {				//정상(누적<최대)
			System.out.println(location + " Tire 수명: " 
		+ (maxRotation-accumulatedRotation) + "회");
		return true;
		}else {												//펑크(누적==최대)
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
