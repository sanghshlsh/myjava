package chap06.exercises.exercise13;

public class Member {
	//작성 위치
	private String name;
	private String id;
	private String password;
	private int age;
	
	//source - > generate getter&setter
	
	
	private boolean stop;
	//boolean type은 get대신 is로 사용하는것이 관례이다.
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
